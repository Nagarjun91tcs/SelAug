package week3.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//String[] name= new String[3];
		//Generic
		//List<String> bigBoss=new ArrayList<String>();
		List<String> bigBoss=new LinkedList<String>();
		bigBoss.add("Balaji"); //First in First out
		bigBoss.add("Kavin");
		bigBoss.add("Sherin");
		bigBoss.add("Dharshan");
		bigBoss.add("Losliya");
		bigBoss.add("Shakshi");
		bigBoss.add("Balaji");
		
		for (String eachName : bigBoss) {
			System.out.println(eachName);
			
		}
		
		bigBoss.remove("Balaji");
		
		bigBoss.clear();
		
		System.out.println(bigBoss.isEmpty());
		
		
		/*System.out.println("*************************");
		for (String eachName : bigBoss) {
			System.out.println(eachName);
			
			
		}*/
		
		//System.out.println(bigBoss.contains("Shakshi1"));
		
		/*System.out.println(bigBoss.size());
		System.out.println(bigBoss.get(2));
		bigBoss.add("Balaji");
		bigBoss.add("Gopi");
		
		System.out.println(bigBoss.size());
		bigBoss.remove("Balaji");
		System.out.println(bigBoss.size());*/
		
		
		
		
		
		
		
		
		
		
		/*ArrayList obj=new ArrayList();
		obj.add(10);
		obj.add(5);
		obj.add("10");*/
		
		
		
		

	}

}
