package Array;

public class QuickSort {
	

	public static void main(String[] args) {
		int[] arr= {5,4,7,6,3,2,9};
		int leng=arr.length;
		QuickSort qs=new QuickSort();
		qs.quicksortrecurssion(arr,0,leng-1);
		qs.printarray(arr);
}
       int partitionarray(int[]arr,int low,int high)
	{
		int pivot=arr[(low+high)/2];
		while(low<=high)
		{
			if(arr[low]<pivot)
			{
				low++;
			}
			else if(arr[high]>pivot)
			{
				high--;
			}
		
		if(low<=high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
	return low;
}
	 void quicksortrecurssion(int[] arr,int low,int high)
	{
		int pi=partitionarray(arr ,low ,high);
				if(low<pi-1)
             {
            	 quicksortrecurssion(arr,low,pi-1);
            }
             if(pi<high) {
            	 quicksortrecurssion(arr,pi,high);
             }
	}
  void printarray(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
