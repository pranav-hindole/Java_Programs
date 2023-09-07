package Array;
import java.util.HashSet;
public class FirstDupliacte {

	public static void main(String[] args) {
		int[] a= {4,3,2,1,5,4,2,1};
		HashSet<Integer> hs=new HashSet<>();
		int temp=-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(hs.contains(a[i]))
			{
			temp=i;	
			}
			else
			{
				hs.add(a[i]);
			}
		}
		if(temp!=-1)
		{
			System.out.println("First duplicate element is "+a[temp]);
		}
		else
		{
			System.out.println("first duplicate element not found");
		}

	}

}
