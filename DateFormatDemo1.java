import java.text.*;
import java.util.*;
class DateFormatDemo1
{
	public static void main(String args[])
	{

	  System.out.println("Full Form : "+ DateFormat.getDateInstance(0,Locale.US).format(new Date()));
	  System.out.println("Long Form : "+ DateFormat.getDateInstance(1,Locale.US).format(new Date()));
	  System.out.println("Medium Form : "+ DateFormat.getDateInstance(2,Locale.US).format(new Date()));
	  System.out.println("Short Form : "+ DateFormat.getDateInstance(3,Locale.US).format(new Date()));
	  System.out.println("Short Form : "+ DateFormat.getDateInstance().format(new Date()));
	}
}
	