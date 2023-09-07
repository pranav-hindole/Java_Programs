package Array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {1,4,6,2,7,3,5};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<(a.length-1-i);j++)
			{
				if(a[j]>a[j+1])//123456
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
             System.out.print(a[i]);
			}
		}
}
