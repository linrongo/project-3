import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTimeTwoTest {
	private DateTimeTwo date;
	@BeforeEach
	void setUp() throws Exception {
		 date = new DateTimeTwo();
	}

	
	void testDaysOfCurrentMonth() {
		date.daysOfCurrentMonth();
	}
	
	
	void testDaysOfAnyMonth() {
		date.daysOfAnyMonth(11, 2019);
		date.daysOfAnyMonth(2, 2000);

	}

	
	void testCompareYear() throws IOException {
		date.compareYear();
	}
	@Test
	void testDateHashMap() throws IOException {
		date.compareYear();
		date.dateHashMap();
	}
	@Test
	void testDateHashMapSorted() throws IOException {
		date.compareYear();
		date.dateHashMapSorted();
	}
	
}
