package String;

public class MultiplePalindromesinString {

	public static void main(String[] args) {
		String s1="malayalam";
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=i+2;j<=s1.length();j++)
			{
				String s2=s1.substring(i,j);
				if(isPalindrome(s2))
				{
					System.out.println(s2);
				}
			}
		}
	}
		
		public static boolean isPalindrome(String s)
		{
			s=s.toLowerCase();
			int i=0;
			int j=s.length()-1;
			while(i<j)
			{
				if(s.charAt(i)!=s.charAt(j))
				{
					return false;
				}
				i++;
				j--;
				}
			return true;
		

	}

	}
