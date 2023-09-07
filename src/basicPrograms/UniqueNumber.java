package basicPrograms;
import java.util.Scanner;
public class UniqueNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();//Unique Number=The number which doesn't have duplicate value. 
		int count1=0;
		int count2=0;
		int r1,r2,num1,num2;//r1,r2=remainder.
		num1=num;
		num2=num;
		while(num1>0)
		{
			r1=num1%10;
			count1++;
			num2=num1;
			while(num2>0)
			{
				r2=num2%10;
				if(r1==r2)
				{
					count2++;
				}
				num2=num2/10;	
			}
			num1=num1/10;
		}
          if(count1==count2)
          {
        	  System.out.println("Unique Number");
          }
          else
          {
        	  System.out.println("Not Unique Number");
          }
	}

}
