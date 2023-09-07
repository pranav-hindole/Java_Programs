package Array;

public class MissingElement {

	public static void main(String[] args) {
		int[] a={1,2,3,4,6};
		int expected_no_of_elements=a.length+1;
		int total_sum=((expected_no_of_elements)*(expected_no_of_elements+1))/2;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		  sum=sum+a[i];	
		}
		System.out.println("Missing Element is "+(total_sum-sum));

	}

}
