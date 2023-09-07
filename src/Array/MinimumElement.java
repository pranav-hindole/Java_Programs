package Array;

public class MinimumElement {

	public static void main(String[] args) {
		int[] a= {2,5,4,3,1,8,6};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min+" is minimum element in array");

	}

}
