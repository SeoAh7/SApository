package question.level3;
import java.util.Scanner;

public class _2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {           //i = 1 2 3
			
			for(int j=1 ; j<=n-i ; j++) {    //j = n-i (1: 3-1  2: 3-2  3: 3-3)
				System.out.print(" ");       // ù°���� 1,2 2�� ��°���� 1 1�� ����°���� 0��
			}
			for(int k=1 ;  k<=i  ; k++) {    //k = i    (1: 1   2: 2    3: 3)
				System.out.print("*");       // ù°���� 1 �ѹ� ��°���� 1,2 �ι� ����°���� 1,2,3 ����
			}
			System.out.print('\n');
		}
		
		sc.close();	
			
	}

}

