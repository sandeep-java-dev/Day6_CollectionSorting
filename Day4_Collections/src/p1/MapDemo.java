package p1;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {
	
	public static void main(String[] args) {
	
		Map map = new LinkedHashMap<>();
		//Map map = new HashMap<>();
		
		map.put(1, "ramesh");
		map.put(2, "mike");
		map.put(1, "mike");
		map.put(3, "jenny");
		
		System.out.println(map.get(1));
		
		// approach 1 : for each
		
		// approach 2
		Iterator itr = map.keySet().iterator();
		
		while(itr.hasNext())
		{
			String name = (String)map.get(itr.next());
		}
		
		
	}

}






