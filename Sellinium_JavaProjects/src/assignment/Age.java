package assignment;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
					
			int a;
		
			a = s.nextInt();
			
			if (a > 0 && a <= 2) {
				
				System.out.println("You are infant");
			}
			else if (a > 2 && a <= 12) {
				
				System.out.println("You are Child");
			}
			
	else if (a > 12 && a <= 25) {
				
				System.out.println("You are Youth");
			}
			
	else if (a > 25 && a <= 59) {
		
		System.out.println("You are Adult");
	}
			
	else if (a > 59 && a <= 100) {
		
		System.out.println("You are Senior Citizen");
	}
			
	else  {
		
		System.out.println("You are living more than 100 years");
	}

	}

}
