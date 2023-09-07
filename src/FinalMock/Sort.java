package FinalMock;

public class Sort {

	public static void main(String[] args) {
		int[] arr={1,3,7,4,9};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
		}
		System.out.print(arr[i]+" ");
		
		}
	}

}
