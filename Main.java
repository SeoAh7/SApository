import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {         
			
			for(int j=0 ; j<=n-i ; j++) {    
				System.out.print("*");      
			}
			System.out.print('\n');
		}
		
		sc.close();	
			
	}
}
