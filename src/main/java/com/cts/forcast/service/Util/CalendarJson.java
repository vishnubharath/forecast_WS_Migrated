package com.cts.forcast.service.Util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarJson {

	public static String PATTERN = "yyyy/MM/dd";

	private int month;
	private int year;
	private static Calendar calendar;

	public CalendarJson(int year, int month) {
		// TODO Auto-generated constructor stub
		this.year = year;
		this.month = month-1;
		init(year, this.month);

	}

	private void init(int year, int month) {
		// TODO Auto-generated method stub
		calendar = Calendar.getInstance();
		calendar.set(year, month, 1);

	}

	public Date getPreviousDate() throws ParseException {
		return parse(format(
				calendar.getActualMinimum(Calendar.DAY_OF_MONTH) - 1)
				.toString());

	}

	public Date min() throws ParseException {
		return parse(format(calendar.getActualMinimum(Calendar.DAY_OF_MONTH))
				.toString());
	}

	public Date max() throws ParseException {
		return parse(format(calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
				.toString());
	}

	private Date gc(int day) {
		new GregorianCalendar(year, month, day);
		return new java.util.Date(new GregorianCalendar(year, month, day)
				.getTime().getTime());

	}

	private String format(int day) {

		SimpleDateFormat format = new SimpleDateFormat(PATTERN);
		return format.format(gc(day));
	}

	private Date parse(String day) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat(PATTERN);
		return format.parse(day);
	}

	private String getExactDateformat(Date date) {

		SimpleDateFormat format = new SimpleDateFormat("EEEE");
		return format.format(date);
	}

	public Month getBusinessCalendar(CalendarJson calc) throws ParseException {
//		System.out.println(calc.max());
//		System.out.println(calc.min());

		Calendar c = Calendar.getInstance();
		c.setTime(calc.min());
		int maxdate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int a = c.get(Calendar.DAY_OF_WEEK);
		Month m = new Month();
		String finalDay = calc.getExactDateformat(calc.min());
//		System.out.println(a);
//		System.out.println(finalDay);

		int day = 1;
		while (day <= maxdate) {

			if (a != 1 && a != 7) {
				m.setWeek(day);

			}
			++day;
			++a;
			if (a == 8) {
				m.clearWeek();
				a = 1;
			}
			if (a == 7) {
				m.setMonth(m.getWeek());
				m.clearWeek();
			}

		}
		m.setMonth(m.getWeek());
//		System.out.print("" + m.getMonth());
		return m;
	}

//	public static void main(String[] args) throws ParseException {
//
//		int year = 2016;
//		int month = 9;
//		CalendarJson calc = new CalendarJson(year, month);
//		Month busineesMonth = calc.getBusinessCalendar(calc);
//		CalendarJson calc1 = new CalendarJson(year, month);
//
//		Month bLineMonth = calc1.getBLineCalendar(calc1);
//		
//
//	}

	public Month getBLineCalendar(CalendarJson calc) throws ParseException {
//		System.out.println(calc.max());
//		System.out.println(calc.min());

		Calendar c = Calendar.getInstance();
		c.setTime(calc.min());
		int maxdate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int a = c.get(Calendar.DAY_OF_WEEK);
		Month m = new Month();
		String finalDay = calc.getExactDateformat(calc.min());
//		System.out.println(a);
//		System.out.println(finalDay);

		int day = 1;
		while (day <= maxdate) {
			int dup = a;
			if (day == 1 && dup >= 2 && dup != 8) {
				init(year, month - 1);
				int previousMon = calendar
						.getActualMaximum(Calendar.DAY_OF_MONTH);

				while (--dup > 1) {
					m.setWeek(previousMon--);
					
				}
				dup++;
				Collections.sort(m.getWeek());
			}

			if (a != 1 && a != 7) {
				m.setWeek(day);

			}
			++day;
			++a;
			if (a == 8) {
				m.clearWeek();
				a = 1;
			}
			if (a == 7) {
				m.setMonth(m.getWeek());
				m.clearWeek();
			}

		}
//		System.out.print("bLien" + m.getMonth());
		return m;
	}
}
