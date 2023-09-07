package String;

public class VowelsPresentInString {

	public static void main(String[] args) {
		String str="Javadeveloper";
		String s1=str.toLowerCase();
		int count=0;
        for(int i=0;i<s1.length()-1;i++)
        {
        	char c=s1.charAt(i);
        	switch(c)
        	{
        	case 'a':
        	case 'e':
        	case 'i':
        	case 'o':
        	case 'u':
        	count++;	
        	}
        	
        }
        System.out.println(count);
	}

}
