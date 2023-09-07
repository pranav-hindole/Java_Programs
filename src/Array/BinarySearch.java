package Array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		int search=1;
		int li=0; //lower index
		int hi=arr.length-1; //higher index
		int mi=(li+hi)/2; //middle index
		while(li<=hi)
		{
			if(arr[mi]==search)
			{
				System.out.println("Element found at "+mi+" position");
				break;
			}
			else if(arr[mi]<search)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
				
			}
			mi=(li+hi)/2;
			
		}
		if(li>hi)
		{
			System.out.println("Element not found");
		}
		

	}

}
