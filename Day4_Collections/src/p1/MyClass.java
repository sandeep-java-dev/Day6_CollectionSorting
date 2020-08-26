package p1;




public class MyClass {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("ramesh",101,2000);
		Employee e2 = new Employee("ramesh",101,2000);
		Employee e3 = new Employee("animesh",102,2300);
		Employee e4 = e1;
		
		//boolean a = (e1 == e2);
		//boolean b = (e1 == e3);
				
		boolean c = (e1.equals(e3)); //false
		System.out.println("Checking e1 and e3: "+c);
		
		
	}
}
