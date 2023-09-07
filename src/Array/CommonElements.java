package Array;
import java.util.HashSet;
public class CommonElements {

	public static void main(String[] args) {
	int[] a={1,6,4,3,7,2,6};
	int[] b={9,8,6,5,7,3,2};
     HashSet<Integer> hs1=new HashSet<>();
     HashSet<Integer> hs2=new HashSet<>();
       for(int no:a)
       {
    	   hs1.add(no);
       }
       for(int no:b)
       {
    	   hs2.add(no);
       }
       for(int no:hs2)
       {
    	   if(hs1.add(no)==false)
    	   {
    		   System.out.println("Common element is "+no);  
    	   }
    	   
       }
       
	}

}
