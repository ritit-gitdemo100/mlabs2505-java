package p04generics;

public class Demo3 {
	
	public static void main(String[] args) {
		
		Integer[] intArr = { 1, 2, 3, 4, 5};
		Double[] doubleArr = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		String[] stringArr = { "Anand", "Bala", "Charles", "Darwin", "Ebi" };
		
		printArr(intArr);
		printArr(doubleArr);
		//printArr(stringArr);
		
	}

	private static <T extends Number> void printArr(T[] arr) {
		
		for(int i=0; i< arr.length; i++)
			System.out.println(arr[i]);
		
		System.out.println();
	}

}
