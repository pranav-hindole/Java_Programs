package Array;
import java.util.*;
import java.util.Comparator;
public class Laptop {
	 String  name;
	 int ssd;
	 int ram;
	 double price;
	 
	 Laptop(String name,int ssd,int ram,double price )
	 {
		 this.name=name;
		 this.ssd=ssd;
		 this.ram=ram;
		 this.price=price;
		}
	 @Override
	 public String toString()
	 {
		 return "Name"+name+"SSD"+ssd+"RAM"+ram+"Price"+price;
	 }
}
    class RamComparator implements Comparator 
    {
    	@Override 
    	public int compare(Object o1,Object o2)
    	{
    		Laptop l1=(Laptop)o1;
    		Laptop l2=(Laptop)o2;
    		if(l1.ram>l2.ram) {
    			return 1;
    		}
    		 else if(l1.ram<l2.ram) {
    			return -1;
    		}
    		 else
    		 {
    			 return 0;
    		 }
    	}
    	class PriceComparator implements Comparator
    	{
    		@Override 
        	public int compare(Object o1,Object o2)
        	{
        		Laptop l1=(Laptop)o1;
        		Laptop l2=(Laptop)o2;
        		if(l1.ram>l2.ram) {
        			return 1;
        		}
        		 else if(l1.ram<l2.ram) {
        			return -1;
        		}
        		 else
        		 {
        			 return 0;
        		 }
        	}
    }
	 
	 class LaptopDriver 
	 {
		 public static void main(String[] args) {
			 Laptop l1=new Laptop("dell",200,8,20000.5);
			 Laptop l2=new Laptop("hp",400,6,40000.5);
			 Laptop[] arr= {l1,l2};
			 Arrays.sort(arr,new RamComparator());
			 int i=0;
			 for( i=0;i<arr.length;i++)
			 {
				 System.out.println(arr[i]+" ");
			 }
			// Arrays.sort(arr.length,i++)
//			 {
//				System.out.println(arr[i]+" "); 
//			 }
//			 
			 
			 
		 }
		

	}

}
