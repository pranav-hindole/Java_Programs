package Array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a={5,1,6,4,8,3,7,2};
		int min;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				
//				if(a[j]<a[min])
//				{
//					min=j;//12345678
//				}
				if(a[j]>a[min])
				{
					min=j;//87654321
				}
			}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			
			
			}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}

}
