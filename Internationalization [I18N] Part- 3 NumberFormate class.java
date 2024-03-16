
										Internationalization [I18N] Part- 3||NumberFormate class
									==============================================================

-----------------------------------------------------------
  Setting Maximum and Minimum fraction and Integer Digits 
-----------------------------------------------------------

 -> NumberFormat class defines the following method for this purpose :


	1. public void setMaximumFractionDigits(int n);
	2. public void setMinimumFractionDigits(int n);
	3. public void setMaximumIntegerDigits(int n);
	4. public void setMinimumIntergerDigits(int n);
	

		12346		.		 789
		  |					  |
	Integer Digits 	  	Fraction Digits


 Ex. 

	NumberFormat nf = NumberFormat.getInstance();
	
	case 1:
		
		nf.setMaximumFractionDigits(2);
		System.out.pritln(nf.format(123.4567)); // 123.46
		System.out.pritln(nf.format(123.4));// 123.4
		
	case 2:
		
		nf.setMinimumFractionDigits(2);
		System.out.pritln(nf.format(123.4567)); //123.4567
		System.out.pritln(nf.format(123.4));// 123.40
	
	case 3:
		
		nf.setMaximumIntegerDigits(3);
		System.out.pritln(nf.format(123456.789));//456.789
		System.out.pritln(nf.format(1.2345));// 1.2345
	
	case 4:
		
		nf.setMinimumIntergerDigits(3);
		System.out.pritln(nf.format(123456.789)); // 123,456.789
		System.out.pritln(nf.format(1.2345)); //001.2345

-------------
 DateFormat	
-------------

	-> Various Locations follows various style to reprasent Date.

		Ex.

			IN: DD-MM-YYYY
			US: MM-DD-YYYY
	
	
	-> We can use DateFormat to format java Date according a particular locale.
	
	-> DateFormat class prasent in java.text package and it is an abstract class.
	
			DateFormat df = new DateFormat();// invali CE: 

-----------------------------------------------
 Getting DateFormat Object for Default Locale:
-----------------------------------------------
 
 -> 

	public static DateFormat.getInstance();
	public static DateFormat.getDateInstance();
	public static DateFormat.getDateInstance(int style);
	
	The allowed style are 0 to 3 
		
	(int style)

	DateFormat.FULL --->0------ Wednesday,10th September 2014;

	DateFormat.LONG --->1------ 10th September 2014;

	DateFormat.MEDIUM --->2------ 10th Sep 2014;
	
	DateFormat.SHORT--->3------ 10/09/14;

 Note: 
 
	-> The default style is medium.
	
-----------------------------------------------	
 Getting DateFormat Object for Specific Locale 	
-----------------------------------------------	

	public static DateFormat.getDateInstance(int style, Locale l)

	-> Once we got DateFormat object we can call the following methods on that object.
	
		1. public String format(Date d);
			
			- To convert java Date form to locale specific String form
			
		2. public Date parse(String s) throws ParseException
		
			- TO convert Locale specific String form to java Date form.
	

	
	
    ----------		format()			----------
    |		 |------------------------> |		 |
    | Java   |                          | Locale |
    | Date   |                          |specific|
    | format |<------------------------ |String	 |
    ---------		parse()             ---------



 -> Write a program to display current system date in all possible styles of US.


	import java.text.*;
	import java.util.*;
	class DateFormatDemo1
	{
		public static void main(String args[])
		{

		  System.out.pritln("Full Form : "+ DateFormat.getDateInstance(0,Locale.US).format(new Date()));
		  System.out.pritln("Long Form : "+ DateFormat.getDateInstance(1,Locale.US).format(new Date()));
		  System.out.pritln("Medium Form : "+ DateFormat.getDateInstance(2,Locale.US).format(new Date()));
		  System.out.pritln("Short Form : "+ DateFormat.getDateInstance(3,Locale.US).format(new Date()));
		  System.out.println("Short Form : "+ DateFormat.getDateInstance().format(new Date()));
		}
	}
		

	output:
	
	Full Form : Saturday, March 16, 2024
	Long Form : March 16, 2024
	Medium Form : Mar 16, 2024
	Short Form : 3/16/24
	Short Form : Mar 16, 2024



 -> Wrtie a program to display current system date in UK, US, and ITALY styles.


	import java.text.*;
	import java.util.*;
	class DateFormatDemo2
	{
		public static void main(String args[])
		{
			
		  DateFormat uk = DateFormat.getDateInstance(0,Locale.UK);
		  DateFormat us = DateFormat.getDateInstance(0,Locale.US);
		  DateFormat italy = DateFormat.getDateInstance(0,Locale.ITALY);
		  System.out.pritln("UK style Is  : "+uk.format(new Date()));
		  System.out.pritln("US style Is  : "+us.format(new Date()));
		  System.out.pritln("ITALY style Is  : "+italy.format(new Date()));
		  
		}
	}

	output:
	
	UK style Is  : Saturday, 16 March 2024
	US style Is  : Saturday, March 16, 2024
	ITALY style Is  : sabato 16 marzo 2024
	
	
-----------------------------------------------------------	
  Getting DateFormat object to display both date and time 	
-----------------------------------------------------------

  -> 
  
	1. public static DateFormat getDateTimeInstance()
	2. public static DateFormat getDateTimeInstance(int datestyle,int timestyle)
	2. public static DateFormat getDateTimeInstance(int datestyle,int timestyle Locale l)
	
	
	The allowed styles for the time also : 0 to 3 only .

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
	output:
	
	US Style is: Saturday, March 16, 2024, 4:53:18?PM India Standard Time
	UK Style is: Saturday, 16 March 2024, 16:53:18 India Standard Time
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	