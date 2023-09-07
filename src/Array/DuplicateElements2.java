package Array;
import java.util.HashSet;
public class DuplicateElements2 {

	public static void main(String[] args) {
		int[] a={2,6,5,4,3,2,1,5};
		HashSet<Integer> hs=new HashSet<>();
		for(int no:a)
		{
			if(hs.add(no)==false)
			{
				System.out.println("Duplicate element found "+no);
			}
		}

	}

}
