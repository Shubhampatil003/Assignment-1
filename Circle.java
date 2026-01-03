import java.util.Scanner;

public class Circle{
    public static void main(String[] args)
    {
        float r;
        double area;
        double circum;
        System.out.println("Enter the Radius:");
        Scanner sc = new Scanner(System.in);

        r=sc.nextFloat();

        area=Math.PI*r*r;
        circum=2*Math.PI*r;
       
        System.out.println("Area is:"+area);
        System.out.println("Circumference is:"+circum);


    }
}