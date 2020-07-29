package Package1;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.*;
import java.text.SimpleDateFormat;

public class StringPrg8 {

	public static void main(String[] args) throws ParseException {
		double dval = 3265.58;
		String dstr = String.valueOf(dval);
		System.out.println("Double to String coversion "+dstr);
		String sval = "97832.56";
		double dtos = Double.parseDouble(sval);
		System.out.println("String to double conversion: " + dtos);
				
		int ival = 87;
		String sival = String.valueOf(ival);
		System.out.println("Integer to double conversion "+sival);
		
		Date dt = Calendar.getInstance().getTime();
		DateFormat dft = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strdt = dft.format(dt);
		System.out.println(strdt);
		
		Date ddt = null;
		String sdate = "7/29/2020";
		DateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
		try {
		ddt = sdt.parse(sdate);
		System.out.println("String to date conversion "+sdt.format(ddt));
	}catch(Exception e){
		e.getLocalizedMessage();
	}

}
}
