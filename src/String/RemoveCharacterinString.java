package String;
import java.util.*;
public class RemoveCharacterinString {
 
	
   public static void main(String[] args) {
		String str="Hello World";
		String s1="";
	
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='o' || str.charAt(i)=='l')
			{
				s1=s1+'x';
			}
		else
			{
		s1=s1+str.charAt(i);
			}
		}
		
           System.out.println(s1);
		
	}

}
