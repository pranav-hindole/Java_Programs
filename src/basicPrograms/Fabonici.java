package basicPrograms;
import java.util.Scanner;
public class Fabonici {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number1");
		int num1=sc.nextInt();
		System.out.println("Enter a number2");
		int num2=sc.nextInt();
	   System.out.println("enter a limit");
	   int limit=sc.nextInt();
	   int res=0;
	   for(int i=1;i<limit;i++)
	   {
		   res=num1+num2;
		   num1=num2;
		   num2=res;
	   }
	   System.out.println(res);

	}

}
