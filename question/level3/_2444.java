package question.level3;
import java.util.Scanner;

public class _2444 {
	
    public static void main(String []args) {
    	
    	Scanner sc = new Scanner(System.in);
		
    	int n;
    	n = sc.nextInt();
    	
    	//À­»ï°¢Çü(n-1ÁÙ) ¸¸µé±â
    	for(int i=0; i<n-1; i++)
		{
			for(int k=0; k<(n*2-1); k++)
			{
				if((n-i-1)<=k && (n-1+i)>=k)
					System.out.print("*");
				else if((n-i)>k)
					System.out.print(" ");
			}
			System.out.println();
		}
    	
    	//¾Æ·§»ï°¢Çü(nÁÙ) ¸¸µé±â
		for(int j=0; j<n; j++)
		{
			for(int k=0; k<(n*2-1); k++)
			{
				if(k<j)
					System.out.print(" ");
				else if(k<=n+(n-j-2))
					System.out.print("*");
			}
		
			System.out.println();
		}
    
		sc.close();
    }
}