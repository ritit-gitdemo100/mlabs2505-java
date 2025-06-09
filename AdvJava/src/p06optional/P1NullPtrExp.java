package p06optional;

public class P1NullPtrExp {

	//UnInitialized
	String name;
	
	public static void main(String[] args) {
		
		P1NullPtrExp obj = new P1NullPtrExp();
		System.out.println(obj.name);
		System.out.println(obj.name.charAt(0));

	}

}
