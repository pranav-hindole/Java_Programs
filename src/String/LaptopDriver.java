package String;
import java.util.Comparator;
import java.util.*;
class Laptop
{
	String name;
	int ssd;
	int ram;
	int price;
	
	Laptop(String name,int ssd,int cc,int price)
	{
		this.name=name;
		this.ssd=ssd;
		this.ram=ram;
		this.price=price;
	}
	public String toString()
	{
		return "NAME: "+name+",SSD: "+ssd+",RAM: "+ram+",PRICE: "+price;
	}
}
class RamComparator implements Comparator
{
	@Override
	public int compare(Object o1,Object o2)
	{
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		if(l1.ram>l2.ram)
		{
			return 1;
		}
		else if(l1.ram < l2.ram)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}	
	}
	class PriceComparator implements Comparator
	{
		@Override
		public int compare(Object o1,Object o2)
		{
			Laptop l1=(Laptop)o1;
			Laptop l2=(Laptop)o2;
			if(l1.price>l2.price)
			{
				return 1;
				
			}
			else if(l1.price<l2.price)
			{
				return -1;
			}
			else
			{
				return 0;
			}
			
		}
	}
public class LaptopDriver {

	public static void main(String[] args) {
		
       Laptop l1=new Laptop("HP",256,6,50000);
       Laptop l2= new Laptop("DELL",256,8,40000);
       Laptop[] arr= {l1,l2};       
       Arrays.sort(arr,new RamComparator());
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println(arr[i]+" ");
       }
       System.out.println("========================================");
       Arrays.sort(arr,new PriceComparator());
       for(int i=0;i<arr.length;i++)
       {
    	  System.out.println(arr[i]+" "); 
       }
	}

}
	
