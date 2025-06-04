package p02thread;

class Plate {
    private boolean hasFood = false;

    public synchronized void putFood() {
        while (hasFood) {
            try {
                wait(); // Wait until food is taken
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasFood = true;
        System.out.println("Chef: Food is ready!");
        notify(); // Notify waiter
    }

    public synchronized void takeFood() {
        while (!hasFood) {
            try {
                wait(); // Wait until food is ready
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasFood = false;
        System.out.println("Waiter: Food is served!");
        notify(); // Notify chef
    }
}

class Chef extends Thread {
    Plate plate;

    Chef(Plate plate) {
        this.plate = plate;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            plate.putFood();
        }
    }
}

class Waiter extends Thread {
    Plate plate;

    Waiter(Plate plate) {
        this.plate = plate;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            plate.takeFood();
        }
    }
}

public class P15InterThread {
    public static void main(String[] args) {
        Plate plate = new Plate();
        new Chef(plate).start();
        new Waiter(plate).start();
    }
}
