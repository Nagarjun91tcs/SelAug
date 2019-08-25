package week1.day2;

public class LearnStringBuffer {
	public static void main(String[] args) {
		String cmp = "testleaf";
		cmp = cmp.replace('t', 'T');
		System.out.println(cmp);
		StringBuilder sb = new StringBuilder(cmp);
		System.out.println(sb.insert(2, 'c'));
		
		
		
		
		
		
	}

}
