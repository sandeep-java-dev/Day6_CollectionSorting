package p1;

import java.util.*;


public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet(); // sorted in nature
		
		Product p1 = new Product();
		p1.setPid(101);
		p1.setProductName("Hp-Laptop");
		p1.setCost(50000);
		p1.setStarRating(4);
		
		Product p2 = new Product();
		p2.setPid(1012);
		p2.setProductName("Dell-Laptop");
		p2.setCost(60000);
		p2.setStarRating(5);
		
		Product p3 = new Product();
		p3.setPid(1401);
		p3.setProductName("abc-Laptop");
		p3.setCost(5000);
		p3.setStarRating(2);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		displayProducts(set);   // default render 
		
		
		// --- to view products on the basis of Star rating
		List<Product> tempList = new ArrayList<>();
		tempList.addAll(set);
		Collections.sort(tempList,new ProductSortOnStarRating());
		
		System.out.println(" --------------- On the basis of Star Rating -----");
		displayProducts(tempList);
		
		
		
	}
	
	public static void displayProducts(Collection<Product> products)
	{
		for (Product p : products) {
			System.out.println("\n"+p);
		}
		
	}
	
}
