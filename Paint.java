import java.util.Scanner;
     public class Paint{
	public static void main(String[] args){
	  
        float lr,br,hr;
        float l,b;
        double surfaceArea=0;
	double roof=0;
	double volume=0;

	Scanner sc=new Scanner(System.in);
	System.out.println("We have a Room with 1 door and 2 windows which has same dimensions\nPlease Enter the dimensions!");
        System.out.println("\nEnter the length of Room:");
	lr=sc.nextFloat();
	System.out.println("Enter the breadth of Room:");
	br=sc.nextFloat();
	System.out.println("Enter the height of Room:");
	hr=sc.nextFloat();
	System.out.println("Enter the length of Door & Windows:");
	l=sc.nextFloat();
        System.out.println("Enter the breadth of Door & Windows:");
	b=sc.nextFloat();
        
	surfaceArea=2*(lr*br+br*hr+hr*lr)-3*(l*b);
        volume=lr*br*hr;
        roof=volume-surfaceArea; 

       System.out.println("area to be painted for interior walls:" + surfaceArea);
       System.out.println("area to be whitewashed (roof):" + roof);
    }
}
**