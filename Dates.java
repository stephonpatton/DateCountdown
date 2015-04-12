import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
public class Dates {
	private static final long SECONDS_IN_A_DAY = 24*60*60;

	public long isolateDate() {
		Calendar today = Calendar.getInstance();
		Calendar futureDay = Calendar.getInstance();
		futureDay.set(2015, 3, 26, 00, 00, 00);
		long diff = futureDay.getTimeInMillis() - today.getTimeInMillis();
		long diffSec = diff / 1000;
		long days = diffSec / SECONDS_IN_A_DAY;
		long secondsDay = diffSec % SECONDS_IN_A_DAY;
		long seconds = secondsDay % 60;
		long minutes = (secondsDay/60) % 60;
		long hours = (secondsDay / 3600);
		System.out.printf("%d days, %d hours, %d minutes and %d seconds\n", days, hours, minutes, seconds);
		return days & minutes & hours & seconds;
	}
}
