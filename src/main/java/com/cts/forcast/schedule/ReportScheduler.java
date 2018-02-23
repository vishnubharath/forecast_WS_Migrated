package com.cts.forcast.schedule;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cts.forcast.common.KeyValuePair;
import com.cts.forcast.service.HolidayService;
import com.cts.forcast.service.Util.CalendarJson;
import com.cts.forcast.service.Util.Month;

@Component
@EnableScheduling
public class ReportScheduler {

	@Autowired
	private HolidayService holidayService;
	
	//@Autowired
	//private ReportsDao reportsDao;

	@Resource(name = "locationBillableHours")
	private Map<String, Integer> locationBillableHours;

	/*@Value("${forcact.batch.size}")
	private int batchSize;*/

	@Async
	@Scheduled(fixedDelay = 100000)
	public void saveReport() {

		Map<Long, List<Date>> holidaysByLocationId = loadHolidays(holidayService.getAllHolidaysByLocation());
		Map<String, Integer> businessCalendarByYearMonth = loadBusinessCalendar();
		
		// Removed Current DAO Layer
		//Collection<Report> reports = reportsDao.getAllLeaves();
		/*Collection<Report> reports = null;
				
		if (CollectionUtils.isNotEmpty(reports)) {
			if (CollectionUtils.isNotEmpty(reports)) {
				reports.forEach(report -> {
					try {
						int hoursPerDay = locationBillableHours.get(report.getLocation_type().toUpperCase());
						List<Date> holidayDates = holidaysByLocationId.get(report.getLocationId());
						if (CollectionUtils.isNotEmpty(holidayDates) && report.getMonth()!=null && report.getYear()!=0) {
							float totalHrs = hoursPerDay * ((businessCalendarByYearMonth.get(
									report.getYear() + "_" + report.getMonth().toUpperCase())==null)?0 : (businessCalendarByYearMonth.get(
											report.getYear() + "_" + report.getMonth().toUpperCase())- holidayDates.size()));
							report.setTotalHours(totalHrs);
							report.setTotalRate(
									new BigDecimal(totalHrs * report.getRate()).setScale(2, RoundingMode.HALF_UP));
						}
					} catch (Exception e) {
						report.setErrorMessage("No Data");
						e.printStackTrace();
					}

					try {
						if(report!=null && report.getErrorMessage()==null){
							// VBJ reportsDao.insert(report);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
			}
		}
*/
	}

	private Map<Long, List<Date>> loadHolidays(List<KeyValuePair<Long, Date>> holidays) {

		if(holidays == null ) return null;
		
		final Map<Long, List<Date>> byLocation = new HashMap<Long, List<Date>>();

		holidays.forEach(holiday -> {

			KeyValuePair<Long, Date> kv = holiday;

			List<Date> dates = null;
			if ((dates = byLocation.get(kv.getKey())) == null) {
				dates = new ArrayList<Date>();
			}
			dates.add(kv.getValue());
			byLocation.put(kv.getKey(), dates);
		});
		return byLocation;
	}

	private static Map<String, Integer> loadBusinessCalendar() {
		Map<String, Integer> calendarDays = new HashMap<String, Integer>();
		java.text.SimpleDateFormat df1 = new java.text.SimpleDateFormat("MM");
		Calendar cal = Calendar.getInstance();

		int year;
		String monthVal = df1.format(cal.getTime());
		int month = Integer.parseInt(monthVal);
		for (int i = 1; i <= 13; i++) {
			year = cal.get(Calendar.YEAR);
			int days = getBusinessDates(year, month);
			calendarDays.put(
					year + "_" + (new DateFormatSymbols().getMonths()[month - 1]).substring(0, 3).toUpperCase(), days);
			if (month == 12) {
				cal.add(Calendar.YEAR, 1);
				month = 1;
			} else {
				month = month + 1;
			}
		}

		cal = Calendar.getInstance();
		monthVal = df1.format(cal.getTime());
		month = Integer.parseInt(monthVal);
		for (int i = 1; i <= 12; i++) {
			year = cal.get(Calendar.YEAR);
			int days = getBusinessDates(year, month);
			calendarDays.put(year + "_" + (new DateFormatSymbols().getMonths()[month - 1]).substring(0, 3), days);
			if (month == 1) {
				cal.add(Calendar.YEAR, -1);
				month = 12;
			} else {
				month = month - 1;
			}
		}

		return calendarDays;
	}

	private static int getBusinessDates(int year, int month) {

		int days = 0;
		CalendarJson calendarJson = new CalendarJson(year, month);
		try {
			// to change based on property - business or beeline
			Month m = calendarJson.getBusinessCalendar(calendarJson);
			String x = m.getMonth().toString();
			String[] y = x.split(",");
			days = y.length;

		} catch (ParseException e) {

			e.printStackTrace();
		}
		return days;
	}
}
