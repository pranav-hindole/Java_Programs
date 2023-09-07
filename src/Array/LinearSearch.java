package Array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {4,5,3,1,6};
		int search=6;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println(search+" element is present at "+i+" postion");
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("Element not found");
		}

	}

}
