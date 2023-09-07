package FinalMock;

public class Countvowels {

	public static void main(String[] args) {
		String str="javadeveloper";
		int count=0;
		 for(int i=0;i<str.length()-1;i++)
		 {
			 char c=str.charAt(i);
			 switch(c)
			 {
			 case 'a':
			 case 'i':
			 case 'o':
			 case 'u':
			 case 'e':
				 count++;
			 }
			 
		 }
		 System.out.println(count+" number of vowels are present in string ");
		

	}

}
