package Array;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr= {3,5,2,1,8,6};
		HeapSort hs=new HeapSort();
		hs.sort(arr);
		hs.print(arr);
}
	void sort(int[] arr)
	{
		int leng=arr.length;
		for(int i=(leng/2)-1;i>0;i--)
		{
			heapify(arr,leng,i);
		}
		//swap the elements and heapify again
		for(int i=leng-1;i>0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
			
		}
	}
	void heapify(int[] arr,int n,int i)
	{
		int largest=i; //parent node index position
		int li=2*i+1;   //left child index position
		int ri=2*i+2;  //right child index position
	if(li<n && arr[li]>arr[largest])
	{
		largest=li;
	}
	if(li<n && arr[ri]>arr[largest])
	{
		largest=ri;
	}
	if(largest!=i)
	{
		int temp=arr[i];
		arr[i]=arr[largest];
		arr[largest]=temp;
		heapify(arr,n,largest);
	}
	}
	void print(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
