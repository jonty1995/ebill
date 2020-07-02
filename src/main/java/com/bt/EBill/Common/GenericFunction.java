package com.bt.EBill.Common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.tools.sjavac.Log;

public class GenericFunction {
	public static <T> T nvl(T a, T b) {
		return (a == null) ? b : a;
	}

	public static String convertToUIDateV1(Object date) {
		String strDate = "";
		if (date != null) {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			strDate = format.format(date);
		}
		return strDate;
	}

	public static Date convertToDBDateV1(String strDate) {
		Date date = new Date();
		if (strDate != null) {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			try {
				date = format.parse(strDate);
			} catch (ParseException e) {
				Log.info(e.toString());
			}
		}
		return date;
	}
}
