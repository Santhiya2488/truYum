package com.cognizant.truyum.util;
import java.util.*;
import java.text.*;  

public class DateUtil {

	public static Date convertToDate(String s) 
	{
		try 
		{
			SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");

			Date date1 = simpleDateFormat.parse(s);
			return date1;
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}
}
