package String;

public class NumbersPresentInString {

	public static void main(String[] args) {
		String str="adityag82";
		int count=0;
       for(int i=0;i<str.length();i++)
       {
    	   char c=str.charAt(i);
    	   if(c>='0' && c<='9')
    	   {
    		   count++;
    	   }
       }
       System.out.println(count);
	}

}
