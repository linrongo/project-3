import java.io.File;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class DateTimeTwo {
	private LocalDate now;
	private Map<LocalDate,Integer> dates;
	
	public void daysOfCurrentMonth() {
		 now = LocalDate.now();		
		DayOfWeek tenthDay = now.withDayOfMonth(10).getDayOfWeek();
		DayOfWeek eighteenthtDay = now.withDayOfMonth(18).getDayOfWeek();
		System.out.println("The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthtDay);
	
	}

	public void daysOfAnyMonth(int month, int year) {
		 now = LocalDate.of(year, month, 15);
		 LocalDate lastDayOfMonth = LocalDate.of(year, month, now.lengthOfMonth());
		 
		 String print = "For the year (" + year + ") and month (" + month +"), the fifteenth day is "
				+ now.getDayOfWeek() + " and the last day is " + lastDayOfMonth.getDayOfWeek();
		 System.out.println(print);
	}

	public void compareYear() throws IOException  {
		
		Scanner file = new Scanner(new File("Dates.txt"));
		dates = new HashMap<LocalDate,Integer>();
		final Integer LINE_LIM = 10;
		
		String input = file.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
		LocalDate date;
		now =  LocalDate.now();
		
		int yearDiff = 0;
		int monthDiff = 0;
		int dayDiff = 0;
		for(Integer i = 1; i< LINE_LIM;i++) {
			
			date = LocalDate.parse(input, formatter);	
			dates.put(date, i);
		
			yearDiff = Math.abs(date.getYear() - now.getYear());
			monthDiff = Math.abs(date.getMonthValue() - now.getMonthValue());
			dayDiff = Math.abs(date.getDayOfMonth() - now.getDayOfMonth());
			
			if (date.isLeapYear()) 		
				System.out.println(date.getYear() + " is a leap year, and Diffrence: " + yearDiff + " years, "
						+ monthDiff + " months, " + dayDiff + " days.");
			
			else 
				System.out.println(date.getYear() + " is a not leap year, and Diffrence: " + yearDiff + " years, "
						+ monthDiff + " months, " + dayDiff + " days.");
		
			input = file.nextLine();
		}
		file.close();
	}

	
	public void dateHashMap() {
        for (Map.Entry<LocalDate,Integer> entry : dates.entrySet())  
            System.out.println(entry.getKey() + ":" + entry.getValue());  
	
		
	}

	public void dateHashMapSorted() {
		TreeMap<LocalDate,Integer> sort = new TreeMap<>(dates); 
        for (Map.Entry<LocalDate,Integer> entry : sort.entrySet())  
            System.out.println(entry.getKey() + ":" + entry.getValue());  		
	}
	


}