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