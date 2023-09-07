package basicPrograms;
import java.util.Scanner;
public class Strontio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 4digit number");
		int num=sc.nextInt();//1221
//		num=num*2;//2442
//		num=num%1000;//442
//		num=num/10;44
		num=(num*2%1000)/10;
		if(num%10==num/10)//4==4
		{
			System.out.println("Strontio Number");
		}
		else
		{
			System.out.println("Not Strontio NUmber");
		}

	}

}
