package Array;

public class IstDuplicateElement {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,1,6,4,5};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					temp++;
					System.out.println("First dupliacte Element is "+a[j]);
					break;
				}
				
			}
			if(temp>0)
			{
				break;
			}
			
		}
		

	}

}
