package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		String name="Balaji";
		char[] charArray = name.toCharArray();
				
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for (char c : charArray) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
		
		System.out.println(map);
		
		//Map<Integer,String> employees=new HashMap<Integer,String>();
		/*
		employees.put(100, "Koushik");
		employees.put(101, "Swetha");
		employees.put(102, "Pradeep");
		employees.put(103, "Santhika");
		
		for(Entry<Integer,String> eachEmp:employees.entrySet()) {
			
			System.out.println(eachEmp.getKey()+" -->" +eachEmp.getValue());
			
		}*/
		
		
		
		
		//System.out.println(employees);
	//	System.out.println(employees.get(101));
		
		/*System.out.println(employees.keySet());
		System.out.println(employees.values());*/
		
	//	System.out.println(employees.containsKey(101));
		
		
		
		
		
		
		
		

	}

}
