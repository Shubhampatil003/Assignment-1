import java.util.Scanner;
	public class salary{
	 public static void main(String[] args){
		int basic;
                int Id;	
		double HA,DA,Tax;
		double Inhand;
		System.out.println("Enter user ID:");
                Scanner sc=new Scanner(System.in);
		Id=sc.nextInt();
	
		System.out.println("Enter Basic Salary:");
		basic=sc.nextInt();
 		
		HA=0.1*basic;
		DA=0.3*basic;
		Tax=0.05*basic;
      
		Inhand=(basic+HA+DA)-Tax;
		
		System.out.println("Inhand Salary is:"+ Inhand);

		}
      }
                