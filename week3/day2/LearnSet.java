package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> bigBoss=new HashSet<String>();
		
		bigBoss.add("Balaji"); 
		bigBoss.add("Kavin");
		bigBoss.add("Sherin");
		bigBoss.add("Dharshan");
		bigBoss.add("Losliya");
		bigBoss.add("Shakshi");
		bigBoss.add("Balaji");
		List<String> list=new ArrayList<String>(bigBoss);
		System.out.println(list.get(2));
		Collections.sort(list);
		Collections.reverse(list);
		
		
		/*for (String eachName : bigBoss) {
			System.out.println(eachName);
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
