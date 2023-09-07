package String;

public class SwapChracterInString {

	public static void main(String[] args) {
		System.out.println(swapchar("abc",1,2));

	}
	public static String swapchar(String s,int i,int j)
	{
		
		char[] a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String(a);
	
	}

}
