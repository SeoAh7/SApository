package question.level2;
import java.util.Scanner;

public class _2884 {
	
    public static void main(String []args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int H,M;
    	H = sc.nextInt();
    	M = sc.nextInt();
    	
    	int res_h;
    	int res_m;
    	
    	if(M-45<0) {
    		if(H==0)
    			res_h = 23;
    		else
    			res_h = H-1;
    	}
    	else 
    		res_h = H;
    	
    	
    	if(M-45<0)
    		res_m = M+45-30;
    	else
    		res_m = M-45;

    	
    	System.out.printf("%d %d\n", res_h, res_m);
    	
    	sc.close();
    }
}
