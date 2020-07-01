package Phase1;

import java.io.*;
import java.util.*;

public class Dirmain implements Directory
	{
		public void addfiles(String Name)
		{
			File createobject=new File("Directory\\"+Name);
			if(!createobject.exists())
			{
				try
				{
					createobject.createNewFile();
					System.out.println("File created successfully");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}
			else
			{
				System.out.println("file is already exists");
			}
	}
		public void listfiles()
		{
			File objectforlist=new File("directory");
			String[]arr=objectforlist.list();
			Arrays.sort(arr);
			for(String iterator:arr)
			{
				System.out.println(iterator);
			}
		}
		public void search(String name)
		{
			File dir = new File("Directory");
		      String[] children = dir.list();
		      
		      if (children == null) {
		         System.out.println("is not a file in the folder");
		      } else {
		         for (int i = 0; i < children.length; i++) {
		            String filename = children[i];
		            System.out.println(filename);
		           
		         }
		         System.out.println("File is found");
		}
	}
		public void delete(String name)
		{
			File objectfordelete=new File("Directory\\"+name);
			if(objectfordelete.exists())
			{
				try
				{
					objectfordelete.delete();
					System.out.println("File is deleted");
				}
				catch(Exception e)
				{
					System.err.println(e);
				}
			}
			else
			{
				System.out.println("File is not found");
			}
		}
		
			
		}

