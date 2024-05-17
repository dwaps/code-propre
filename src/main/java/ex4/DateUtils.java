package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String format(String pattern, Date date) {
		return formatDate(pattern, date);
	}

	public static String formatDefaut(Date date) {
		return formatDate("dd/MM/yyyy HH:mm:ss", date);
	}

	private static String formatDate(String pattern, Date date) {
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
}
