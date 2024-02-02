import entityLombok.Product;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();
		product1.setId(1);
		
		Product product2 = new Product();
		product2.setId(1);
		
	if(product1.equals(product2)) {
		System.out.println("passed");
	}else {
		System.out.println("false");
	}

	}

}
