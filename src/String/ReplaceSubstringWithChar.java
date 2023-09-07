package String;

public class ReplaceSubstringWithChar {

	public static void main(String[] args)
	{
		String str="Hello";
		String s1="";
		int n=str.length();
		int a=0;
		while(a<n)
		{
         if(str.charAt(a)=='l' && str.charAt(a+1)=='l' && str.charAt(a+2)=='o' )
         {
        	 s1=s1+'y';
        	 a=a+3;
         }
         else
         {
        	 s1=s1+str.charAt(a);
        	 a=a+1;
         }
	}
		System.out.println(s1);
	}

}
