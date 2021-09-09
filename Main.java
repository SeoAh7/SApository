import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    int kor;
	    System.out.print("국어: ");
	    kor = scanner.nextInt();
	    
	    String grade="";
	    
	    if (kor>=0 && kor<=100) {
	    
		    //if문
	    	/*
		    if (kor>=90 && kor<=100)
		    	grade = "A";
		    else if(kor>=80 && kor<90)
		    	grade = "B";
		    else if(kor>=70 && kor<80)
		    	grade = "C";
		    else if(kor>=60 && kor<70)
		    	grade = "D";
		    else if(kor<60)
		    	grade = "F";
		    */
		    
		    //case문
		    switch(kor/10) {
			    case 10:
			    case  9: grade = "A"; break;
			    case  8: grade = "B"; break;
			    case  7: grade = "C"; break;
			    case  6: grade = "D"; break;
			    default: grade = "F";
		    }
		    System.out.printf("점수: %d  등급: %s\n", kor, grade);
		    
	    } else {
	    	System.out.println("점수를 잘못 입력하였습니다");
	    }
		
		scanner.close();
		
	}

}
