import java.util.Scanner;

public class Velocity{
    public static void main(String[] args)
    {
        float u;
        float a;
        int t;
        double velocity;
        double distance;

        System.out.println("Enter The initial Velocity:");
        Scanner sc=new Scanner(System.in);
        u=sc.nextFloat();

        System.out.println("Enter The Acceleration:");
        a=sc.nextFloat();
         
        System.out.println("Enter Time in Seconds:");
        t=sc.nextInt();

        velocity=u+(a*t);
        distance=u+(a*t*t);

        System.out.println("Final Velocity is:"+ velocity);
        System.out.println("Total Distance Covered is:" + distance);




    }

}