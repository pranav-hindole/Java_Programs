package String;
import java.util.Scanner;

	 class UnderAgeException extends RuntimeException {
		
		UnderAgeException(String msg)
		{
			super(msg);
		}
	}
	class Voting{
		public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		try
		 {
			if(age<18)
			{
		   throw  new UnderAgeException("You are not eligible for voting");
		    }
			else
			{
				System.out.println("You can vote");
			}
		  }
		catch(UnderAgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exception Handled Successfully");
		

		}

	}
