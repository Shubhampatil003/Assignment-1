import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args)
    {
        float r;
        float h;
        double SurfaceArea;
        double volume;

        System.out.println("Enter the Radius:");
        Scanner sc = new Scanner(System.in);
        r=sc.nextFloat();

        System.out.println("Enter The Height:");
        h=sc.nextFloat();

        SurfaceArea=2*Math.PI*r*(r+h);
        volume=Math.PI*r*r*h;

        System.out.println("Surface Area is:"+SurfaceArea);
        System.out.println("Volume is:"+volume);

    }
    
}
