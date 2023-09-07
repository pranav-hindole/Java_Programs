package basicPrograms;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();//22
		int temp=num;
		int rem=0;
		int sum=0;
		int mul=1;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+rem;//2+2=4
			mul=mul*rem;//2*2=4
			temp=temp/10;
		}
		if(sum==mul)//4==4
		{
			System.out.println("Spy Number");;
		}
		else
		{
			System.out.println("Not Spy Number");
		}

	}

}
