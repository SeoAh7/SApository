package question.level3;
import java.util.Scanner;

public class _2739 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("");
		n = sc.nextInt();
		
		for(int i=1 ; i<=9 ; i++) {
			
			System.out.printf("%d * %d = %d\n", n, i, n*i);
			
		}
		
		sc.close();
	}	
		
}
