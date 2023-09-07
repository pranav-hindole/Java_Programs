package String;

public class PalindromeInString {

	public static void main(String[] args) {
		String str="malayalam";
		String s1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s1=s1+str.charAt(i);
		}
		System.out.println(s1);
		if(str.equals(s1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
				

	}

}
