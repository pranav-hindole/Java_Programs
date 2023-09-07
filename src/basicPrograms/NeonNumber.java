package basicPrograms;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();//9
		int mul=num*num;//9*9=81
		int sum=0;
		while(mul>0)
		{
			int rem=mul%10;
			sum=sum+rem;//8+1=9
			mul=mul/10;
		}
		if(num==sum)//9==9
		{
			System.out.print("NEON NUMBER");
		}
		else
		{
			System.out.println("Not Neon Number");
		}
		
	}

}
