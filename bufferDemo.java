import java.io.*;
import java.util.*;
class Demo
{
	public static void main(String arg[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("abc.txt",true);
			BufferedOutputStream br=new BufferedOutputStream(fos);
			String str="";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter File Content");
			while(!str.equals("stop"))
			{
				str=sc.nextLine();
				byte [] x=str.getBytes();
				br.write(x);
				br.flush();
				
			}
			fos.close();
			System.out.println("File Saved.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}// This program Only Increases Speed of the Execution through Buffer.