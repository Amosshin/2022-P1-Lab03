// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 100 Point Version\n");
		int milli = 10000123;
		int x = 10000123%1000;
		int hour = (milli)/3600000;
		int minutes = (milli%3600000)/60000;
		int second = ((milli%3600000)%60000)/1000;
		int Milli = (x%3600)%1000;

		System.out.println("Starting milli-second:" + milli);
		System.out.println("Hour:" + hour);
		System.out.println("Minute:" + minutes);
		System.out.println("Second:" + second);
		System.out.println("Milli-seconds:" + Milli);


      
	}
}

