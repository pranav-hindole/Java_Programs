package Array;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] a={2,1,4,5,2,6};
		System.out.println("Duplicate Elements are ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.println(" Duplicate Element found "+a[j]);
				}
			}
		}
	}

}
