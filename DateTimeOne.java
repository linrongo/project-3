import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	
	// get Current Date and Time
	private LocalDateTime locNow = LocalDateTime.now();
	

	@Override
	int getValueOfSecond() {
	// print and return second now
		System.out.println("The value of Second now: " + locNow.getSecond());
		return locNow.getSecond();
	}

	@Override
	void dateTimeNow() {
	// turn locNow into a string using DatetimeFormater and print it out
		String dateNow = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a").format(locNow);
		System.out.println("Current Date/Time: " + dateNow);
	}

	@Override
	void sleepForFiveSec() {
		 try {
			 // stop the program for 5 seconds
		        Thread.sleep(5000L);
		    } catch (InterruptedException e) {
		    }	
		 }

	@Override
	void dateTimeOfOtherCity() {
	// set a format for the LocalDateTime
		DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
	// get time from other zones by adding and subtracting hours accordingly
		LocalDateTime gmt = locNow.plusHours(5);
		LocalDateTime bst = gmt.plusHours(6);
		LocalDateTime cst = locNow;
	// print it out with the correct format
		String print = String.format("Time on Server: %s\nGMT: %s\nBST (90E): %s\nCST (90W): %s",
				time.format(locNow),time.format(gmt),time.format(bst),time.format(cst));
		System.out.println(print);
	}
	
	@Override
	void dateTimeDifferentZone() {
	// set format and get time from other zones
		DateTimeFormatter time = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");	
		LocalDateTime gmt = locNow.plusHours(5);
		LocalDateTime bst = gmt.plusHours(6);
		LocalDateTime cst = locNow;
	// print it accordingly
		String print = String.format("GMT: %s\nBST: %s\nCST: %s"
				,time.format(gmt),time.format(bst),time.format(cst));
		System.out.println(print);

	}

	@Override
	void timeZoneHashMap() {
	// set format and get time from other zones
		DateTimeFormatter time = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
			LocalDateTime gmt = locNow.plusHours(5);
			LocalDateTime bst = gmt.plusHours(6);
			LocalDateTime cst = locNow;
	// create and add zone as key and DateTime as value in to the HashMap
		Map<String,String> style1 = new HashMap<String,String>();
			style1.put("BST", time.format(bst));
			style1.put("AST", "10/01/2020 19:59");
			style1.put("CST", time.format(cst));
			style1.put("ZST", "11/05/2018 19:59");
			style1.put("GMT", time.format(gmt));
		System.out.println("Print Style 1: ");
	// sort using TreeMap and print out the contents inside the Map
		 TreeMap<String, String> sort = new TreeMap<>(style1); 
	        for (Map.Entry<String, String> entry : sort.entrySet())  
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        
	// create a 2nd Map and put value from the first one as key for this one
	    Map<String,String> style2 = new HashMap<String,String>();
			style2.put(style1.get("BST"),time.format(bst));
			style2.put(style1.get("AST"),time.format(bst));
			style2.put(style1.get("CST"),time.format(bst));
			style2.put(style1.get("ZST"),time.format(bst));
			style2.put(style1.get("GMT"),time.format(bst));
		System.out.println("Print Style 3: ");
	// sort it using TreeMap and print out all the key
		 sort = new TreeMap<>(style2); 
	        for (Map.Entry<String, String> entry : sort.entrySet())  
	            System.out.println(entry.getKey());
	// create an Array and put the LocalDateTime inside        
	    LocalDateTime[] style3 = new LocalDateTime[5];
		    style3[0] = LocalDateTime.parse(style1.get("BST"), time);
		    style3[1] = LocalDateTime.parse(style1.get("AST"), time);
		    style3[2] = LocalDateTime.parse(style1.get("CST"), time);
		    style3[3] = LocalDateTime.parse(style1.get("ZST"), time);
		    style3[4] = LocalDateTime.parse(style1.get("GMT"), time);
	// sort in reverse order using Collections.reverseOrder() and print out the contents
	    Arrays.sort(style3, Collections.reverseOrder());
	    System.out.println("Print Style 5: Final sorted Array:");
	    	for (LocalDateTime e : style3)
	    		System.out.println(e);
	    
	    
	}
	
}