package String;

public class RemoveCharReverseString {

	public static void main(String[] args) {
		String str="umbrella";
		String s1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!='l')
				{
						s1=s1+str.charAt(i);
				}
		}
		System.out.println(s1);

	}

}
