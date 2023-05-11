package mx.com.qtx.util;

import java.util.Date;
import java.util.GregorianCalendar;

public class FechaUtil {
	public static Date getDate(int anio, int mes, int dia, int hora, int min) {		
		GregorianCalendar gc = new GregorianCalendar(anio, mes - 1, dia, hora, min);
		return gc.getTime();		
	}

}
