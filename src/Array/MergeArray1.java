package Array;

public class MergeArray1 {

	public static void main(String[] args) {
		int[]  a= {10,20,30};
		int[] b= {40,50,60,70};
		int a_leng=a.length;
		int b_leng=b.length;
		int c_leng=a_leng+b_leng;
		int[] c=new int[c_leng];//array creation 
		for(int i=0;i<a.length;i++)
		{
		 c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
