package Array;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] a={2,5,3,4,1,9,8};
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				second_largest=largest;
				largest=a[i];
			}
			else if(a[i]>second_largest && a[i]!=largest)
			{
				second_largest=a[i];
			}
		}
		if(second_largest==Integer.MIN_VALUE)
		{
			System.out.println("Second largest element not found");
		}
		else
		{
			System.out.println("Second largest element is "+second_largest);
         }

	}

}
