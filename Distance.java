import java.util.Scanner;
	public class Distance{
	   public static void main(String[] args){
              float x1,y1,x2,y2;
              double X=0,Y=0;
              double distance=0;

              Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the X co-ordinate of First point:");
	      
	      x1=sc.nextFloat();
		
	     System.out.println("Enter the Y co-ordinate of First point:");
             y1=sc.nextFloat();
	     System.out.println("Enter the X co-ordinate of First point:");
	     x2=sc.nextFloat();
             System.out.println("Enter the Y co-ordinate of First point:");
             y2=sc.nextFloat();


            X=Math.pow(x2-x1,2);
	    Y=Math.pow(y2-y1,2);

            distance=Math.sqrt(X+Y);	
	
	   System.out.println("The Distance Between Two Points is : " + distance);
     }
}	
              