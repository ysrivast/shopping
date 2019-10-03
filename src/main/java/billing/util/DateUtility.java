package billing.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtility {
	public static int getDiffYears(Date date) {
		Calendar createdDate = getCalendar(date);
		Calendar currentDate = Calendar.getInstance();
		int diff = currentDate.get(Calendar.YEAR)
				- createdDate.get(Calendar.YEAR);
		if (createdDate.get(Calendar.DAY_OF_YEAR) > currentDate
				.get(Calendar.DAY_OF_YEAR)) {
			diff--;
		}
		return diff;
	}

	private static Calendar getCalendar(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
}
