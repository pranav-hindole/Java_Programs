package basicPrograms;

public class Primeprg {

	public static void main(String[] args) {
		
		
			for(int num=2;num<=100;num++)
			{
				int count=0;
				for(int i=3;i<num-1;i++)
				{
				if(num%i==0)
				{
			      count++;
			      
				}
			}
			if(count==0)
		   {
			System.out.println(num);
		   }
		
			}
	}
}

