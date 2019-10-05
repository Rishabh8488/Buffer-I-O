import java.io.*;
class Demo
{
	public static void main(String abc[])
	{
		try
		{
			InputStreamReader isr=new InputStreamReader(System.in); // for input through keyboard.
			BufferedReader br=new BufferedReader(isr); //buffer for speed
			System.out.println("Enter Student Name ");
			String str=br.readLine(); 					//read whole line
			PrintStream x=new PrintStream(System.out); //print stream class. System.out gives output on desktop.
			x.println("Student Name :"+str);	//print
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}