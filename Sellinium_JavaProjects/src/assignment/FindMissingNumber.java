package assignment;

import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String sat = "Test 1, Test 2, Test 3, Test 4, Test 5, Test 6, Test 7, Test 8, Test 9, Test 10";
		System.out.println("Imagine any text below section");
		System.out.println(sat);
		
		System.out.println("****************************************************************************");
		
		System.out.println("check your imagine text available in section1");
		System.out.println("****************************************************************************");
		String section1 = "Test 1, Test 6, Test 8, Test 10";
		System.out.println(section1);
		System.out.println("****************************************************************************");
		System.out.println("if yes, type 1 else 0");
		int s1 = s.nextInt();
		
		System.out.println("#############################################################################");
		
		System.out.println("check your imagine text available in section2");
		System.out.println("****************************************************************************");
		String section2 = "Test 5, Test 6, Test 2, Test 10, Test 9";
		System.out.println(section2);
		System.out.println("****************************************************************************");
		System.out.println("if yes, type 2 else 0");
		int s2 = s.nextInt();
		
		System.out.println("#############################################################################");
		

		System.out.println("check your imagine text available in section3");
		System.out.println("****************************************************************************");
		String section3 = "Test 5, Test 6, Test 3, Test 7, Test 10, Test 9, Test 8";
		System.out.println(section3);
		System.out.println("****************************************************************************");
		System.out.println("if yes, type 3 else 0");
		int s3 = s.nextInt();
		
		System.out.println("#############################################################################");
		
		
		System.out.println("check your imagine text available in section3");
		System.out.println("****************************************************************************");
		String section4 = "Test 4, Test 7, Test 10, Test 9, Test 8";
		System.out.println(section4);
		System.out.println("****************************************************************************");
		System.out.println("if yes, type 4 else 0");
		int s4 = s.nextInt();
		
		System.out.println("#############################################################################");
		
		int finalText = s1 + s2 + s3 + s4;
		System.out.println("Your imagine text is = Test" +finalText);
		System.out.println("#############################################################################");
		
		
		
		
	}

}
