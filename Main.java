package Phase1;

import java.io.File;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	Directory fordirectory=new Dirmain();
	Scanner scan=new Scanner(System.in);
	System.out.println("Welcome to the directory to create a user");
	File file=new File("Directory");
	if(!file.exists())
	{
		if(file.mkdir())
		{
			System.out.println("Directory is created sucessfully ");
		}
		else
		{
			System.out.println("failed to load dir");
		}
	}
	else
	{
		System.out.println("Directory is already exists");
	}
	int option=0;
	do
	{
		System.out.println("press option for:\n 1.add file\n 2.delete a file\n 3.search a file\n 4.sort a file\n 5.exist\n");
		System.out.println("Please enter your option");
		option =scan.nextInt();
		
		switch(option)
		{
		
		case 1:
			System.out.println("enter file name to create");
			String filename=scan.next();
			fordirectory.addfiles(filename);
			break;
		case 2:
			System.out.println("enter file name to delete");
			String fname=scan.next();
			fordirectory.delete(fname);
			break;
		case 3:
			System.out.println("enter file name to search");
			String nametosearch=scan.next();
			fordirectory.search(nametosearch);
			break;
		case 4:
			System.out.println("file will be in sorted order");
			fordirectory.listfiles();
			break;
		case 5:
			break;
		}
	}while(option!=3);
	System.out.println("end of the file");
	}
}

