package Array;
import java.util.ArrayList;
public class EvenOddElementsArray {

	public static void main(String[] args) {
		int[] a={2,5,3,1,6,8,7};
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		int evensum=0;
		int oddsum=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					al1.add(a[i]);
				}
				else
				{
					al2.add(a[i]);
				}
			}
			for(int no:al1)
			{
				
				System.out.print("To Print Array of Even Number\t");
				System.out.println(no);
				evensum=evensum+no;
			}
			System.out.println("to Print Sum of Even numbers "+evensum);
				System.out.println("to Print Size of Even Number Array"+al1.size());
				
			
			for(int no:al2)
			{
				
				System.out.print("To Print Array of Odd Number\t");
				System.out.println(no);
				oddsum=oddsum+no;
			}
			System.out.println("to Print Sum of Odd numbers "+oddsum);
			System.out.println("to Print Size of Odd Number Array"+al2.size());
				
			
		}

	}


