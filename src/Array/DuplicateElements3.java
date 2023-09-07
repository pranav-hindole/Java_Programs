package Array;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
public class DuplicateElements3 {

	public static void main(String[] args) {
		int[] a={4,5,6,2,4,1,2};
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int no:a)
		{
			Integer count=hm.get(no);
			if(count==null)
			{
				hm.put(no, 1);
			}
			else
			{
				count++;
				hm.put(no,count);
			}
		}
		System.out.println("Duplicate elements are");
		Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
		for(Map.Entry<Integer,Integer> me:es)
		{
			if(me.getValue()>1)
			{
				System.out.println(me.getKey()+" ");
			}
		}

	}

}
