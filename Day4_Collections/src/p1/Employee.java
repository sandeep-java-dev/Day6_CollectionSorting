package p1;

public class Employee {

	private String name;
	private int id;
	private int salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// Employee 
		
		if(obj instanceof Employee)
		{
			Employee e = (Employee)obj;
			
			System.out.println("1");
			boolean a = e.name.equals(this.name);
			if(!a)return false;
			
			System.out.println("2");
			boolean b = (e.salary == this.salary);
			if(!b)return false;
			
			System.out.println("3");
			boolean c = (e.id == this.id);
			if(!c)return false;
			
			
			System.out.println(" ------- if else condition check start");
			
			if(a && b && c) return true;
			else return false;
			
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
	
}//end of class









