package week1.day2;

public class LearnString {
	public static void main(String[] args) {
		String company = "AmaZon";
		char[] org = company.toCharArray();
		for (char c : org) {
			int a = c;
			if (a >= 97 && a <= 122) {
				System.out.print(c);
			}
//			System.out.println(c +" "+a);
		}
		
		
		
		
		
		
		
//		String lowerCase = company.toLowerCase();
//		char[] dup = lowerCase.toCharArray();
		
		
		/*for (int i = 0; i < dup.length; i++) {
			if (org[i] ==  dup[i]) {
				System.out.print(org[i]);
			}
		}*/















		//		String str = new String("testleaf"); // object
		/*String str = "testleaf has 45 employees"; // literal
		String replaceAll = str.replaceAll("\\d", "");
		System.out.println(replaceAll);*/








		/*int length = str.length();
		String replace = str.replace("z", "");
		int length2 = replace.length();
		System.out.println(replace);
		System.out.println(length - length2);*/








		/*	String[] split = str.split("s");
		System.out.println(split.length -1);*/







		/*String[] split = str.split(" ");
		for (String eachWord : split) {
			System.out.println(eachWord);
		}*/







		String expected = "Testleaf software";






		/*int length = str.length();
		char charAt = str.charAt(length -1);
		System.out.println(charAt);*/



		/*String upperCase = expected.toUpperCase();
		System.out.println(upperCase);*/





		/*String lowerCase = expected.toLowerCase();
		System.out.println(lowerCase);*/



		/*if (expected.endsWith(str)) {
			System.out.println("begins");
		}else {
			System.out.println("no");
		}*/

		/*if (expected.contains(str)) {
			System.out.println("contains");
		}else {
			System.out.println("no");
		}*/

		/*if (str.equalsIgnoreCase(expected)) {
			System.out.println("Matches");
		}else {
			System.out.println("no match");
		}*/

		/*char[] charArray = str.toCharArray();
		int count = 0;
		for (char c : charArray) {
			if(c == 'e') {
				count++;
			}
		}
		System.out.println(count);*/

		/*int length = str.length();
		System.out.println(length);
		String trim = str.trim();
		System.out.println(trim);*/
	}
}



