import java.text.*;
	import java.util.*;
	class DateFormatDemo2
	{
		public static void main(String args[])
		{
			
		  DateFormat uk = DateFormat.getDateInstance(0,Locale.UK);
		  DateFormat us = DateFormat.getDateInstance(0,Locale.US);
		  DateFormat italy = DateFormat.getDateInstance(0,Locale.ITALY);
		  System.out.println("UK style Is  : "+uk.format(new Date()));
		  System.out.println("US style Is  : "+us.format(new Date()));
		  System.out.println("ITALY style Is  : "+italy.format(new Date()));
		  
		}
	}
