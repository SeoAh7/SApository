package question.level3;
import java.util.Scanner;

public class _2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {           //i = 1 2 3
			
			for(int j=1 ; j<=n-i ; j++) {    //j = n-i (1: 3-1  2: 3-2  3: 3-3)
				System.out.print(" ");       // 첫째줄은 1,2 2번 둘째줄은 1 1번 세번째줄은 0번
			}
			for(int k=1 ;  k<=i  ; k++) {    //k = i    (1: 1   2: 2    3: 3)
				System.out.print("*");       // 첫째줄은 1 한번 둘째줄은 1,2 두번 세번째줄은 1,2,3 세번
			}
			System.out.print('\n');
		}
		
		sc.close();	
			
	}

}

