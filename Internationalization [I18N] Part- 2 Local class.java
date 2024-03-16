
											Internationalization [I18N] Part- 2||Local class
										========================================================


 -------------
  Local class 
 -------------

 -> A local object reprasent a geoghrapic Location (Country or Language or both) example we can create local object 
	to reprasent India. We can create local object to reprasent Engalish language.
 
 -> Locale class prasent in java.util package.
 
 -> It is final class and it is the direct child class of Object.
 
 -> It implements Serializable and Cloneable interfaces.
 
 --------------- 
  Constructors
 ---------------

	1. Locale l = new Locale(String language);
	
	2. Locale l = new Locale(String language, String country);
	
	
		eg:							
									|-> punjuabi 
			Locale l = new Locale("Pa", "IN");
										  |---> India 	
										  
 -> Locale class already define some constants to reprasent some standard locales we can use this constants directly.
 
	Locale.US
	Locale.UK
	Locale.ITALY
	Locale.ENGLISH
	
------------------------------------
  Important method of Locale class 
------------------------------------

	1. public static  Locale.getDefault();
	
	2. public static void setDefault(Locale l);
	
	3. public String getLanguage(); // EN it reprasent shortcut reprasentation
	
	4. public String getDispalyLanguage(); // ENGLISH
	
	5. public String getCountry(); // US 
	
	6. public String getDisplayCountry(); // United State 
	
	3. public static String[] getISOlanguages();
	
	4. public static String[] getISOCountries();
	
	5. public static Locale[] getAvailableLocales();
	
		----------
		|		 |.getLanguage(); // EN it reprasent shortcut reprasentation
		| Locale |.getDispalyLanguage(); // ENGLISH
		| Object |.getCountry(); // US 
		|		 |.getDisplayCountry(); // United State 
		---------


	Ex. 
	
	
		import java.util.*;
		class LocaleDemo1
		{
			public static void main(String args[])
			{
				Locale l1 = Locale.getDefault();
				System.out.println(l1.getCountry()+"....."+l1.getLanguage());
				System.out.println(l1.getDisplayCountry()+"....."+l1.getDisplayLanguage());
				Locale l2 = new Locale("pa", "IN");
				Locale.setDefault(l2);
				System.out.println(Locale.getDefault().getDisplayLanguage());
				String [] s3 = Locale.getISOLanguages();
				for (String s4:s3)
				{
				   System.out.println(s4);
				}
				String [] s4 = Locale.getISOCountries();
				for (String s5:s4)
				{
					System.out.println(s5);
				}
				Locale [] s = Locale.getAvailableLocales();
				for(Locale s1:s)
				{
					System.out.println(s1.getDisplayCountry()+"...."+s1.getDisplayLanguage());
				}
			}
		}

 
-----------------
   NumberFormat
-----------------

  -> Various locations follows various styles to reprasent a java number.
  
  -> Ex, 
  
		double d = 123456.789;
		
			  IN = 1,23,456.789;
			  US = 123,456.789;
			ITALY =  123.456,789;

 -> We can use NumberFormat class to format a java Number According to a particular Locale.

 -> NumberFormat class prasent in java.text package and it is abstract class.

 -> NumberFormat nf = new NumberFormat(); //invalid because it is abstract class and we can create object for abstract 
										  // class.
 -----------------------------------------------
 Getting NumberFormat Object for default Locale 
 ------------------------------------------------
 
 
	-> NumberFormat class defines the following Methods for this purpose

		public static NumberFormat nf = NumberFormat.getInstance();
		public static NumberFormat nf = NumberFormat.getCurrencyInstance();
		public static NumberFormat nf = NumberFormat.getPercentInstance();
		public static NumberFormat nf = NumberFormat.getNumberInstance();

--------------------------------------------------
 Getting NumberFormat Object for specific Locale			
--------------------------------------------------

	-> The above method are same but have to pass the corrusponding locale object as argument.
		
		public static NumberFormat nf = NumberFormat.getInstance(Locale l);	
		public static NumberFormat nf = NumberFormat.getCurrencyInstance(Locale l);
		public static NumberFormat nf = NumberFormat.getPercentInstance(Locale l);
		public static NumberFormat nf = NumberFormat.getNumberInstance(Locale l);								


	-> Once we got NumberFormat Object we can call format and parse() method on that object.
	
		public String format(long l);
		public String format(double d);
	
			- To convert java number form to locale specific String form 
	
		public Number parse(String s) throws ParseException
		
			- To convert locale specific String from to java number form.
			
	Eg. 		
						|NumberFormat.format(long l);
			String s = 	|
						|NumberFormat.format(double d);
			
		
			Number n = NumberFormat.parse(String s);
		



		----------		format()			----------
        |		 |------------------------> |		 |
        | Java   |                          | Locale |
        | Number |                          |specific|
        |		 |<------------------------ |String	 |
        ---------		parse               ---------


 -> Write a program to display a java number in ITALY specific form .

		import java.text.*;
		import java.util.*;
		class NumberFormatDemo2
		
		{
			public static void main(String args[])
			{
				double d = 123456.789;
				NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
				String s = nf.format(d);
				System.out.println("ITALY specific form : " +s); //ITALY specific form : 123.456,789
			}
		}

 
 -> Write a program to display a java number in UK,US,and INDIA currency forms ?
 
	

	import java.text.*;
		import java.util.*;
		class NumberFormatDemo1
		
		{
			public static void main(String args[])
			{
				double d = 123456.789;
				Locale india = new Locale("Pa", "IN");
				NumberFormat nf = NumberFormat.getCurrencyInstance(india);
				System.out.println("India form is  : " +nf.format(d));
				
				NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
				System.out.println("US form is  : " +nf1.format(d));
				
				NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
				System.out.println("UK form is  : " +nf2.format(d));
				
			}
		}
		
		output
		
		India form is  : ?123,456.79
		US form is  : $123,456.79
		UK form is  : £123,456.79
















































									
									