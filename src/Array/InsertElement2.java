package Array;

public class InsertElement2 {

	public static void main(String[] args) {
		// Insert Element at Index position 3 
          int[] a={10,20,30,40,50};
          int insert=100;
          int index_pos=3;
          for(int i=a.length-1;i>index_pos;i--)
          {
        	  a[i]=a[i-1];
          }
          a[index_pos]=insert;
          System.out.println("Element is Successfully Inserted at Index position 3");
          for(int i=0;i<a.length;i++)
          {
        	  System.out.print(a[i]+" ");
          }
	}

}
