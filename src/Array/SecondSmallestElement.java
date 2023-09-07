package Array;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int[] a={3,1,5,6,7,9};
		int smallest=Integer.MAX_VALUE;
		int second_smallest=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				second_smallest=smallest;
				smallest=a[i];
			}
			else if(a[i]<second_smallest && a[i]!=smallest)
			{
				second_smallest=a[i];
			}
		}
		if(second_smallest==Integer.MAX_VALUE)
		{
			System.out.println("Second Smallest Element not found");
		}
		else
		{
			System.out.println("Second Smallest Element is "+second_smallest);

		}
		
	}

}
