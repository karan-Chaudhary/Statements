import java.util.Scanner;


public class Switch {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the grade you obtained");
		Scanner mark=new Scanner(System.in);
		String grade=mark.next();
		
		switch(grade){
		
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
		System.out.println("Well Done");
		break;
		case "D":
			System.out.println("You Passed");
			break;
		case "F":
			System.out.println("Better try again");
			break;
			default:
				System.out.println("Invalid Grade");
				
		}
		System.out.println("Your grade is "+grade);
	}

}

