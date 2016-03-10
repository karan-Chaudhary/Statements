import java.util.Scanner;



public class Ifelse_security {

	
	public static void main(String[] args) {
		int password,pwd;
		pwd=12345;
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("You are Welcome to our world:Plaese enter your PASSWORD to Enter !");
		
		password=sc.nextInt();
		
		
		if(password==pwd){
			
		System.out.println("You are Welcome to your Site.....Lets Enjoy");
		
			
		}
		
		else{
			
			System.out.println("You are thief");
			System.out.println("You are thief");
			System.out.println("You are thief");
			System.out.println("You are thief");
		}
		
	}
}
