package p04generics;

class Product<E> {
	
	E productId;

	public E getProductId() {
		return productId;
	}

	public void setProductId(E productId) {
		this.productId = productId;
	}
	
}
public class Demo2 {
	
	public static void main(String[] args) {
		
		Product<Integer> p1 = new Product<>();
		p1.setProductId(101);
		System.out.println(p1.getProductId());
		
		
		Product<String> p2 = new Product<>();
		p2.setProductId("ABC101");
		System.out.println(p2.getProductId());
		
		
	}

}
