/**
 * 
 */
import java.nio.channels.ServerSocketChannel;
import java.util.Calendar;
import java.util.Date;
//import java.time.
/**
 * @author User
 *
 */
public class UtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		String currentDate = String.valueOf(dt.getDate());
		System.out.println("Current Date is :" + currentDate);
		System.out.println("Current Time is :" + dt.getTime());
		
		Calendar cal = Calendar.getInstance();
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int day = Integer.parseInt(args[2]);
		int hourOfDay = Integer.parseInt(args[3]);
		int minute = Integer.parseInt(args[4]);
		int second = Integer.parseInt(args[5]);
		cal.set(year,month-1,day,hourOfDay,minute,second);
		
		String yourDate=cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR) + "" + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" +  cal.get(Calendar.SECOND) + "" + cal.getTimeZone().getDisplayName();
		
		
		//String currentCalDate=cal.get(Calendar.DATE) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR) + "" + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" +  cal.get(Calendar.SECOND) + "" + cal.getTimeZone().getDisplayName();
		
		//System.out.print("Current Date is :" + currentCalDate);
		System.out.println("Your Date is :" + yourDate);

	}

}
