package p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

class Dog{}

public class CollectionDemo1 {

	public static void main(String[] args) {

		// Animal a = new Dog();
		ArrayList list1 = new ArrayList();
		LinkedList list2 = new LinkedList();
		
		doStuff(list1, 15);
		doStuff(list2, 15);
		doStuff(list1, new Exception());
		doStuff(list1, new Employee());
		doStuff(list2, new Employee("ef", 1, 3434));
		doStuff(list2, new Thread());
		doStuff(list1, new Dog());
		doStuff(list2, new Dog());
		doStuff(list2, "dsfged");
		doStuff(list1, 415.58f);
		doStuff(list2, true);
		
		
		display(list1);
		display(list2);
		
		
		
	}

	public static void doStuff(List list,Object data) {
		list.add(data);
		
	}
	public static void display(List list)
	{
		System.out.println(list);
	}

}
