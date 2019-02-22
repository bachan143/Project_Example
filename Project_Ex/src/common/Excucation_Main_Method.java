package common;

import data.Read_Writer_CsvFile;

public class Excucation_Main_Method
{
	public static void main(String[] args)
	{
	Read_Writer_CsvFile obj=new Read_Writer_CsvFile();
	      obj.readCsvFile();
	      obj.serach_Particular_Event_Id();
	      
	    }
}
