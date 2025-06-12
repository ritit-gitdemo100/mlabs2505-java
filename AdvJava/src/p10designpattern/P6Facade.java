package p10designpattern;

//Subsystem classes
class DVDPlayer {
	public void on() {
		System.out.println("DVD Player is on.");
	}
	public void play(String movie) {
		System.out.println("Playing movie: " + movie);
	}
	public void off() {
		System.out.println("DVD Player is off.");
	}
}

class Projector {
	public void on() {
		System.out.println("Projector is on.");
	}
	public void off() {
		System.out.println("Projector is off.");
	}
}

class Amplifier {
	public void on() {
		System.out.println("Amplifier is on.");
	}
	public void setVolume(int volume) {
		System.out.println("Setting volume to: " + volume);
	}
	public void off() {
		System.out.println("Amplifier is off.");
	}
}

class Lights {
	public void dim(int level) {
		System.out.println("Lights are dimmed to: " + level + "%");
	}
}

//Facade class
class HomeTheaterFacade {
	private DVDPlayer dvdPlayer;
	private Projector projector;
	private Amplifier amplifier;
	private Lights lights;

	public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Amplifier amplifier, Lights lights) {
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.amplifier = amplifier;
		this.lights = lights;
	}

	public void startMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		lights.dim(10);
		projector.on();
		amplifier.on();
		amplifier.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}

	public void endMovie() {
		System.out.println("Shutting down movie theater...");
		dvdPlayer.off();
		amplifier.off();
		projector.off();
		lights.dim(100);
	}
}

public class P6Facade {
	public static void main(String[] args) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		Projector projector = new Projector();
		Amplifier amplifier = new Amplifier();
		Lights lights = new Lights();

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, amplifier, lights);

		homeTheater.startMovie("Inception");
		System.out.println();
		homeTheater.endMovie();
	}
}
