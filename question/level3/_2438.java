package question.level3;
import java.util.Scanner;

public class _2438 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("");
		n = sc.nextInt();
		
		for(int i=0 ; i<=n-1 ; i++) {
			
			for (int j=1 ; j<=i+1 ; j++) {
				
				System.out.printf("*");
				
			}
			System.out.println();
		}
		
		sc.close();
	}	
		
}

