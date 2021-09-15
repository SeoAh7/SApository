package question.level1;
import java.util.Scanner;

public class _2588 {
	
    public static void main(String []args) {
    	
    	Scanner sc = new Scanner(System.in);
		
    	int a;
    	a = sc.nextInt();
    	int b;
    	b = sc.nextInt();
		
    	System.out.println(a*(b%10));
    	System.out.println(a*(b/10%10)); 
    	System.out.println(a*(b/100));  
    	System.out.println(a*b);   
    	
		sc.close();
    }
}
