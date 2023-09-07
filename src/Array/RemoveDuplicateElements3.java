package Array;
import java.util.HashSet;
public class RemoveDuplicateElements3 {

	public static void main(String[] args) {
		//Array is not sorted
		int[] a={1,2,3,2,5,6,5};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println("Duplicate Elements are Removed Successfully ");
		for(int no:hs)
		{
			System.out.print(no+" ");
		}

	}

}
