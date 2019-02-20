package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Read_Writer
{
	
	Scanner scanner = null;
	String line=null;
	Scanner scanner1=null;
	int index=0;
	Data_Detalis det;

	List<Data_Detalis> detalis=new ArrayList<Data_Detalis>();
	public void readWriter()
	{
	
	    try
	    {
		
		
		scanner = new Scanner(new File("f://window/bachan100.csv"));
		
		
	
		while ( scanner.hasNextLine()) 
		{
			 det = new Data_Detalis();
			 scanner1 = new Scanner(scanner.nextLine());
			 scanner1.useDelimiter(",");
			
			while(scanner1.hasNext())
			{
				String data = scanner1.next();
				if (index == 0)
					det.setLabel(data);
				else if (index == 1)
					det.setDate(data);
				else if (index == 2)
					det.setTime(data);
				else if (index == 3)
					det.setSourse(data);
				else if(index==4)
					det.setEvent_Id(Integer.parseInt(data));
				else if(index==5)
					det.setTask_Category(data);
				else
					System.out.println("invalid data::" + data);
				index++;
				    
			}
			index=0;
			detalis.add(det);
			
		}
		System.out.println("================");
		System.out.println(detalis);
		
		
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
	finally 
	{
		try
		{
			if (scanner != null) scanner.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
}



