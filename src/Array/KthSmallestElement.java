package Array;

public class KthSmallestElement {

	public static void main(String[] args)
	{
		int[] a={5,16,7,8,12,1,2,31};
		int temp=0;
		int k=5;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(k==i-1)
			{
				System.out.println("Kth Smallest element is "+a[i]);
				break;
			}
			
		}
	}

}
