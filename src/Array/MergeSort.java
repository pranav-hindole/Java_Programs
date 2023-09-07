package Array;

public class MergeSort {
	int[] array;
	int[] tempMergearr;
	int length;
	public static void main(String[] args) 
	{
		
		int[] inputarr={48,36,13,52,19,94,21};
	     MergeSort ms=new MergeSort();
	     ms.sort(inputarr);
	     for(int i:inputarr)
	     {
	    	System.out.print(i+" "); 
	     }
	}
	
     public void sort(int inputarr[])
	{
		this.array=inputarr;
		this.length=inputarr.length;
		this.tempMergearr= new int[length];
		divideArray(0,length-1);
	}
	public void divideArray(int lowerindex,int higherindex)
	{
		
		if(lowerindex<higherindex)
		{
		int middle=lowerindex+(higherindex-lowerindex)/2;
		//It will sort left side of an array
		divideArray(lowerindex,middle);
		////It will sort right side of an array

		divideArray(middle+1,higherindex);
		mergeArray(lowerindex,middle,higherindex);
	}
	}
		public void mergeArray(int lowerindex,int middle,int higherindex)
		{
			for(int i=lowerindex;i<=higherindex;i++)
			{
				tempMergearr[i]=array[i];
			}
			int i=lowerindex;
			int j=middle+1;
			int k=lowerindex;
			while(i<=middle && j<=higherindex)
			{
				if(tempMergearr[i]<=tempMergearr[j])
				{
					array[k]=tempMergearr[i];
					i++;
				}
				else
				{
					array[k]=tempMergearr[j];
					j++;
				}
				k++;
			}
			while(i<=middle)
			{
				array[k]=tempMergearr[i];
				k++;
				i++;
			}
		}
	}

