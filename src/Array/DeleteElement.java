package Array;

import java.nio.channels.AsynchronousServerSocketChannel;

public class DeleteElement {

	public static void main(String[] args) {
		int[] a={10,20,30,40,50};
		int count=0;
		int del_element=30;
		for(int i=0;i<a.length;i++)
		{
			if(del_element==a[i])
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				count++;
				break;
			}
			
		}
		if(count==0)
		{
			System.out.println("element not found to delete");
			
		}
		else
		{
			System.out.println("Number is deleted succesfully");
			for(int i=0;i<a.length-1;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
