package question.level3;
import java.util.Scanner;

public class _8393 {
	
    public static void main(String []args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n;
    	n = sc.nextInt();

    	int sum=0;
    	
    	for(int i=1; i<=n; i++) {
    		
    		sum = sum + i;
    	}
    	
    	System.out.println(sum);
    	
    	sc.close();
    }
}
