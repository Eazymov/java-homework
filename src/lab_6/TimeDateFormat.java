package lab_6;

import java.text.SimpleDateFormat;
import java.util.*;

class TimeDateFormat {

	public static void main(String args[]) {
	    Calendar cal = Calendar.getInstance();

	    String s = String.format("%tc", cal);
	    System.out.println(s);

	    s = String.format("%tr", cal);
	    System.out.println(s);
	    
	    s = String.format("%tl:%tM", cal, cal);
	    System.out.println(s);
	    
	    s = String.format("%tB %tb %tm", cal, cal, cal);
	    System.out.println(s);

	    s = String.format("%tr", cal);
	    System.out.println(s);

	    s = String.format("%tT", cal);
	    System.out.println(s);
	    
	    s = String.format("%tD", cal);
	    System.out.println(s);

	    s = String.format("%tA %tB %td, %tY", cal, cal, cal, cal);
	    System.out.println(s);

	    s = String.format("%tl:%tM %Tp", cal, cal, cal);
	    System.out.println(s);
	    
	    s = new SimpleDateFormat("MM-dd-yyyy").format(cal.getTime());
	    System.out.println(s);
	}
}
