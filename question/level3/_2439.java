package question.level3;
import java.util.Scanner;

public class _2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {           //i = 1 2 3 4 5
			
			for(int j=1 ; j<=n-i ; j++) {    //j = n-i (1: 5-1  2: 5-2  3: 5-3  4: 5-4  5: 5-5)  1 2 3 4
				System.out.print(" ");       // ù°���� 1,2,3,4 �׹� ��°���� 1,2,3 ���� ... �ټ���°���� 0��
			}
			for(int k=1 ;  k<=i  ; k++) {    //k = i    (1: 1   2: 2    3: 3    4: 4    5: 5)
				System.out.print("*");       // ù°���� 1 �ѹ� ��°���� 1,2 �ι� ... �ټ���°���� 5��
			}
			System.out.print('\n');
		}
		
		sc.close();	
			
	}

}

