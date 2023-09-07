package Array;

public class InsertElement {

	public static void main(String[] args) {
		//Insert Element at position 3 
		int[] a= {10,20,30,40,50};
		int ins_element=100;
		int pos=3;
       for(int i=a.length-1;i>pos-1;i--)
       {
    	   a[i]=a[i-1];
       }
       a[pos-1]=ins_element;
       System.out.println("Element is successfully inserted");
       for(int i=0;i<a.length;i++)
       {
    	   
    	   System.out.print(a[i]+" ");
       }
	}

}
