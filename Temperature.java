import java.util.Scanner;

public class Temperature {
    public static void main(String[] args)
    {
        float f;
        double C;
        double K;

        System.out.println("Enter temperature in Fahrenheit:");

        Scanner sc=new Scanner(System.in);
        f=sc.nextFloat();

        C=(5.0/9)*(f-32);
        K=C+273.15;

        System.out.println("Temperature in Celsius is:"+C);
        System.out.println("Temperature in Kelvin is:"+K);


    }
    
}
