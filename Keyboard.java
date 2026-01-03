import java.util.Scanner;
	public class Keyboard{
	public static void main(String[] args){
        char ch;
	char previous,next;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Character:");
        ch=sc.next().charAt(0);
 
	previous=(char)(ch-1);
        next=(char)(ch+1);

	System.out.println("Previous Character is:" + previous);
	System.out.println("Next Character is:" + next);
  
     }
}