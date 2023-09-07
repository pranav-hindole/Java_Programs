package Array;

public class kthLargestElement {

	public static void main(String[] args) {
		int[] a={5,16,7,8,12,1,2,31};
		int temp=0;
		int k=3;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				

			}
			if(k==i-1)
			{
				System.out.println("Kth largest element is "+a[i]);
			}
			
		}
		
	}

}
