import java.util.Scanner;

public class cuboid{
    public static void main(String[] args)
    {
        float l;
        float b;
	float h;
        
        double surfacearea;
        double volume;

        System.out.println("Enter Length:");
        Scanner sc=new Scanner(System.in);
        l=sc.nextFloat();

        System.out.println("Enter breadth:");
        b=sc.nextFloat();
         
        System.out.println("Enter Height:");
        h=sc.nextFloat();

        surfacearea=2*((l*b)+(b*h)+(h*l));
        volume=l*b*h;

        System.out.println("surface area is:"+ surfacearea);
        System.out.println("Volume is:" + volume);




    }

}