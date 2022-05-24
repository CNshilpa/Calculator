import java.util.Scanner;

public class Calc {
	static int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	static int sub(int a, int b)
	{
		int sum=a-b;
		return sum;
	}
	static int multi(int a, int b)
	{
		int sum=a*b;
		return sum;
	}
	static int div(int a, int b)
	{
		int sum=a/b;
		return sum;
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr your first number :");
		int a=scanner.nextInt();
		System.out.println("Enter your second number ");
		int b=scanner.nextInt();
		System.out.println("Select your option");
		int option=scanner.nextInt();
		switch(option)
		{
		case 1: System.out.println("Seleccted the Addition");
		         int result= add(a,b);
		         System.out.println("Addition is :" +result);
		         break;
		case 2:  System.out.println("Seleccted the substraction");
		         int result1= sub(a,b);
                 System.out.println("Substraction is :" +result1);
                 break;
		case 3:  System.out.println("Seleccted the Multiplication");
                 int result2= multi(a,b);
                 System.out.println("Multiplication is :" +result2);
                 break;  
       default:  System.out.println("Seleccted the Division");
                 int result3= div(a,b);
                 System.out.println("Division is :" +result3);
                  
		}
		
	}

}
