package String;

public class ReverseString {

	public static void main(String[] args) {
          String str="Aditya";
          String s1="";
          for(int i=str.length()-1;i>=0;i--)
          {
        	  s1=s1+str.charAt(i);
          }
          System.out.println(s1);
	}

}
