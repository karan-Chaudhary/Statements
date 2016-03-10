import java.util.Scanner;


public class Ifelse_result {

	
	public static void main(String[] args) {
		
int marksObtained,passmarks;

passmarks=40;

Scanner sc=new Scanner(System.in);
	
System.out.println("Enter marks you Obtained");

marksObtained=sc.nextInt();

if(marksObtained>=passmarks){
System.out.println("You hava been passed");
}
else{
	System.out.println("Unfortunately!! You have been failed");
	
}



	}

}
