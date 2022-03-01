package sample;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 12;
		int c = 24;
		int d = 59;
		int e = 100;
		int f = 24;
		
		
		if ( a <= b && a <= c && a <= d && a <= c && a <= e && a <= f ){
			System.out.println("Infant is Selected");
		}
		
		else if ( b <= a && b <= c && b <= d && b <= e && b <= f ){
			System.out.println("Child is Selected");
		} 
		
		else if ( c <= a && c <= b && c <= d && c <= e && c <= f ){
			System.out.println("Youth is Selected");
		} 
		
		else if ( d <= a && d <= b && d <= c && d <= e && d <= f ){
			System.out.println("Adult is Selected");
		} 
		
		else {
			System.out.println("Senior Citizen is Selected");
		} 
		
		

	}

}
