package String;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

class ReadAndWrite{
	void readfile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(":d/abc.txt");
	}
	void savefile() throws FileNotFoundException
	{
		FileOutputStream fos=new FileOutputStream(":d/abc.txt");
	}
}
public class Test {

	public static void main(String[] args) {
		ReadAndWrite rw=new ReadAndWrite();
		try
		{
		rw.readfile();	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
		rw.savefile();	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exception handled Succesfully");

	}

}
