package question.level3;
import java.util.Scanner;

public class _2441 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			//i = 0 1 2 3 4
			//* = 4 3 2 1 0
			//  = 0 1 2 3 4
			for(int k=0; k<n; k++) 
			{
				if(k<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
