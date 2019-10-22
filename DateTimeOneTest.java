import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTimeOneTest {

	private DateTimeOne date;

	@BeforeEach
	void setUp() throws Exception {
		date = new DateTimeOne();
	}

	@Test
	void testGetValueOfSecond() {
		int actual = date.getValueOfSecond();
		 LocalDateTime now = LocalDateTime.now();
		int expected = now.getSecond();
		assertEquals(expected, actual);
	}

	@Test
	void testDateTimeNow() {
		date.dateTimeNow();
	}

	
	void testSleepForFiveSec() {
		fail("Not yet implemented");
	}

	@Test
	void testDateTimeOfOtherCity() {
		date.dateTimeOfOtherCity();
		
	}

	@Test
	void testDateTimeDifferentZone() {
		date.dateTimeDifferentZone();
	}

	@Test
	void testTimeZoneHashMap() {
		date.timeZoneHashMap();
	}

}
