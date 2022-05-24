import java.util.Scanner;

public class factorial {
static int fact(int n) {
	int fact=1;
	for(int i=1;i<=n;i++)
	{
	 fact=fact*i;
	 
	}
	return fact;
}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr your number");
		int n=scanner.nextInt();
		int sum=fact(n);
		System.out.println("Factorial of "+n+" is : " +sum);
	}
}
