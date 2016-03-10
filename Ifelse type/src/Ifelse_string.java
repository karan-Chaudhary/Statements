import java.util.Scanner;


public class Ifelse_string {

	public static void main(String[] args) {
		

		String password;
		String pwd;
		
		pwd="karan";
		
		
		
		System.out.println("You are Welcome to our World!!Enter a password to enter");
		
		Scanner sc=new Scanner(System.in);
		password=sc.next();
	
		if(password.equals(pwd)){
			System.out.println("You are Welcome to your World");
			
		}
		else {
			System.out.println("!!PASSWORD WRONG!! You are thief");
		}
		
	}

}
