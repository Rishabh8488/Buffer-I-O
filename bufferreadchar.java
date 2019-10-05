import java.io.*;
class Demo
{
	public static void main(String abc[])
	{
		try
		{
			FileReader fr=new FileReader("abc2.txt");
			BufferedReader br=new BufferedReader(fr);
			System.out.println("File Content");
			String str="";
			while((str=br.readLine())!=null)		//BufferedReader Function which reads whole line in one go. Commonly Used. Stops at null.
			{
				System.out.print(str);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}