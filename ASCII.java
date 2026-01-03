import java.util.Scanner;
	public class ASCII{
	public static void main(String[] args){
	char ch;
 	int value=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character:");
	
	ch=sc.next().charAt(0);
	
	value=ch;

	System.out.println("ASCII value is : " + value);
   }
}