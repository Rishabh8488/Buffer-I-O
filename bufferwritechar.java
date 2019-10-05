import java.io.*;
class Demo
{
	public static void main(String abc[])
	{
		try 
		{
			FileWriter fw=new FileWriter("abc2.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			String str="All is well";
			char [] ch=str.toCharArray();
			bw.write(ch);
			bw.flush();
			fw.close();
			System.out.println("Data Saved");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}