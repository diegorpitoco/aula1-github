package curso;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class aulaCalendar {

	public static void main(String[] args) {

		SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(dt1.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		/*cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();*/
		
		int minutes = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: "+ minutes);
		System.out.println("Mês: "+ mes);
		
		System.out.println(dt1.format(d));
		
	}

}
 