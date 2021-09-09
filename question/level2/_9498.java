package question.level2;
import java.util.Scanner;

public class _9498 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    int score;
	    score = scanner.nextInt();
	    System.out.print("");
	    
	    String grade="";
	    
		if(score>=90 && score<=100)
			grade = "A";
		else if(score>=80 && score<=89)
			grade = "B";
		else if(score>=70 && score<=79)
			grade = "C";
		else if(score>=60 && score<=69)
			grade = "D";
		else 
			grade = "F";
		
		System.out.printf("%s\n",grade);
		
		scanner.close();
		
	}

}
