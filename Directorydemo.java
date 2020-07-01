package Phase1;

import java.io.File;

public class Directorydemo {
	public static void main(String []args)throws Exception
	{
		String s1="Dir";     /*In any location we can create dir using dir path*/
		File d1=new File(s1);
		
		if(d1.mkdirs())
		{
			System.out.println(s1+" directories created sucessfully");
		}
		else
		{
			System.out.println(s1+" directories already present");
		}
	}
}
