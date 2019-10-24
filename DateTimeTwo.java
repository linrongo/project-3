import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.time.temporal.ChronoUnit;



public class DateTimeTwo {
	private LocalDate now;
	private Map<LocalDate,Integer> dates;
	
	public void daysOfCurrentMonth() {
	// get date now
		 now = LocalDate.now();	
	// using that data, find what day of the week it is on the 10th and 18th
		DayOfWeek tenthDay = now.withDayOfMonth(10).getDayOfWeek();
		DayOfWeek eighteenthtDay = now.withDayOfMonth(18).getDayOfWeek();
		System.out.println("The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthtDay);
	
	}

	public void daysOfAnyMonth(int month, int year) {
	// set the 15th day with year and month from the input
		 now = LocalDate.of(year, month, 15);
	// get the last day of that month
		 LocalDate lastDayOfMonth = LocalDate.of(year, month, now.lengthOfMonth());
	// print day of the week using those two
		 String print = "For the year (" + year + ") and month (" + month +"), the fifteenth day is "
				+ now.getDayOfWeek() + " and the last day is " + lastDayOfMonth.getDayOfWeek();
		 System.out.println(print);
	}

	public void compareYear() throws IOException  {
	// read through the file	
		BufferedReader file = new BufferedReader(new FileReader("Dates.txt"));
		dates = new HashMap<LocalDate,Integer>();
		final Integer LINE_LIM = 10;
		String input = file.readLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
		LocalDate date;
		now =  LocalDate.now();
		
		long yearDiff = 0;
		long monthDiff = 0;
		long dayDiff = 0;
		for(Integer i = 1; i<=LINE_LIM ;i++) {
			
		// turn the dates from the file into LocalDate	
			date = LocalDate.parse(input, formatter);
		// put it into the hashMap
			dates.put(date, i);
		// calculate difference in years, months and days
			yearDiff =  ChronoUnit.YEARS.between(date, now);
			dayDiff = ChronoUnit.DAYS.between(date, now) % 30;			
			monthDiff = ChronoUnit.MONTHS.between(date, now) % 12;
		// put those in correct output by seeing if its leap year or not	
			if (date.isLeapYear()) 		
				System.out.println(date.getYear() + " is a leap year, and Difference: " + yearDiff + " years, "
						+ monthDiff + " months, and " + dayDiff + " days.");
			
			else 
				System.out.println(date.getYear() + " is not a leap year, and Difference: " + yearDiff + " years, "
						+ monthDiff + " months, and " + dayDiff + " days.");
		
			input = file.readLine();
		}
		file.close();
	}

	
	public void dateHashMap() {
	// print out HashMap
        for (Map.Entry<LocalDate,Integer> entry : dates.entrySet())  
            System.out.println(entry.getKey() + ":" + entry.getValue());  
	
		
	}

	public void dateHashMapSorted() {
	// sort by key using TreeMap
		TreeMap<LocalDate,Integer> sort = new TreeMap<>(dates); 
	// printout the sorted MAP
        for (Map.Entry<LocalDate,Integer> entry : sort.entrySet())  
            System.out.println(entry.getKey() + ":" + entry.getValue());  		
	}
	


}