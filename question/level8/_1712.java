package question.level8;
import java.util.Scanner;

public class _1712 {
	
    public static void main(String []args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int a,b,c;
    	a = sc.nextInt();
    	b = sc.nextInt();
    	c = sc.nextInt();
    	
    	int n;
    	
    	if(c<=b)
    		n = -1;
    	else
    		n = a/(c-b) + 1;
    		
    		System.out.println(n);
    	
    	sc.close();
    }
}
