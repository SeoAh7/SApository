package question.level3;

import java.util.Scanner;

public class _2445 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		int total_len = n*2-1;
		
		//위 5줄
		for(int i=0; i<n; i++) {
			
			for(int k=0; k<n*2; k++) {
				if(k<=i || (k>=(total_len-i) && k<n*2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		//아래 4줄
		for(int j=n ; j<total_len; j++) {
			
			for(int k=0; k<n*2; k++) {
				if( k<(total_len-j) ||  k>j) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		sc.close();
	}
}