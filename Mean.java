import java.util.Scanner;

public class Mean {
    public static void main(String[] args)
    {
        float a;
        float b;
        double AM;
        double HM;

        System.out.println("Enter First number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        System.out.println("Enter Second number:");
        b=sc.nextFloat();

        AM=(a+b)/2.0;
        HM=(a*b)/(a+b);

        System.out.println("Arithematic Mean is:" + AM);
        System.out.println("Harmonic Mean is:" + HM);

    }
    
}
