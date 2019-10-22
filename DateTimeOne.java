import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	private Date now = new Date();
	LocalDateTime locNow = LocalDateTime.now();


	@Override
	int getValueOfSecond() {
		System.out.println("The value of Second now: " + locNow.getSecond());
		return locNow.getSecond();
	}

	@Override
	void dateTimeNow() {
		String dateNow = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a").format(locNow);
		System.out.println("Current Date/Time: " + dateNow);
	}

	@Override
	void sleepForFiveSec() {
		 try {
		        Thread.sleep(5000L);
		    } catch (InterruptedException e) {
		    }	
		 }

	@Override
	void dateTimeOfOtherCity() {
		DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime gmt = locNow.plusHours(5);
		LocalDateTime bst = gmt.plusHours(6);
		LocalDateTime cst = locNow;
		
		String print = String.format("Time on Server: %s\nGMT: %s\nBST (90E): %s\nCST (90W): %s",
				time.format(locNow),time.format(gmt),time.format(bst),time.format(cst));
		System.out.println(print);
	}
	
	@Override
	void dateTimeDifferentZone() {
		DateTimeFormatter time = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");	
		LocalDateTime gmt = locNow.plusHours(5);
		LocalDateTime bst = gmt.plusHours(6);
		LocalDateTime cst = locNow;
		
		String print = String.format("GMT: %s\nBST: %s\nCST: %s"
				,time.format(gmt),time.format(bst),time.format(cst));
		System.out.println(print);

	}

	@Override
	void timeZoneHashMap() {
		// TODO Auto-generated method stub
		
	}
   
}