package question.level1;

import java.util.Scanner;

public class _10869 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
			
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a-(a/b*b));
		
		scanner.close();
		
				
	}

}
