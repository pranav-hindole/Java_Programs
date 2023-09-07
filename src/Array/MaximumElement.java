package Array;

public class MaximumElement {

	public static void main(String[] args) {
		int[] a= {3,5,4,6,2,1};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max+" is maximum element in given array");
		
		

	}

}
