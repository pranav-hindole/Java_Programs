package FinalMock;
import java.util.Scanner;
class UnderAgeException extends Exception
{
	UnderAgeException(String s)
	{
		super(s);
	}
}
public class eligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new UnderAgeException("You cannot Vote");
				
			}
			else
			{
				System.out.println("you can vote");
			}
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
		}
		
       System.out.println("Exception Handled Successfully");
	}

}
