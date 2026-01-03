import java.util.Scanner;
  
public class swapping{
  public static void main(String[] args){
	int a;
	int b;
	int temp;
	System.out.println("Enter first Number:");
	Scanner sc=new Scanner(System.in);

	a=sc.nextInt();
	System.out.println("Enter first Number:");
	b=sc.nextInt();

	temp=a;
	a=b;
	b=temp;
	System.out.println("Numbers after interchanging:" + a + " " +b);
	
	}
   }
