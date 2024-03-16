import java.text.*;
	import java.util.*;
	class DateTimeFormatDemo3
	{
		public static void main(String args[])
		{
			DateFormat us = DateFormat.getDateTimeInstance(0,0,Locale.US);
			DateFormat uk = DateFormat.getDateTimeInstance(0,0,Locale.UK);
			System.out.println("US Style is: " + us.format(new Date()));
			System.out.println("UK Style is: " + uk.format(new Date()));
		}
	}
	
	