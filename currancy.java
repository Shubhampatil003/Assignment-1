import java.util.Scanner;
	public class currancy{
	  public static void main(String[] args){
		int amount;
		int n=0;
		int ten,five,one;
       		
		System.out.println("Enter The Amount:");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
	    

		ten=amount/10;
		n=amount%10;
	
		five=n/5;
		n=n%5;

		one=n;

		System.out.println("Notes Of Ten =" + ten);
		System.out.println("Notes of Five =" + five);
		System.out.println("Notes of One =" + one);
      }
}