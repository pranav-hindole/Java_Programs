package basicPrograms;

public class StarPattern12 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=9;k>(2*i);k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
