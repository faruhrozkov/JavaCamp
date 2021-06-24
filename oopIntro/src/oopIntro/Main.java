package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		//Product product1 = new Product(1,"Lenova V14",15000,"16 GB Ram",10,13500); 
				//referans olusturma,intance
		

		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName ("Lenova V14");
		product2.setUnitPrice (15000);
		product2.setDetail ("32 GB Ram");
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
         		
		
		

		
	}

}
