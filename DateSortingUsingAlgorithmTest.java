import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateSortingUsingAlgorithmTest {
	DateSortingUsingAlgorithm dateSortingUsingAlgorithm;
	@BeforeEach
	void setUp() throws Exception {
	     dateSortingUsingAlgorithm = new DateSortingUsingAlgorithm();	    

	}

	@Test
	void testDateHashMapSortedDescending() {
		dateSortingUsingAlgorithm.dateHashMapSortedDescending();
	}

	@Test
	void testDateHashMapSorted() {
		dateSortingUsingAlgorithm.dateHashMapSorted();
	}

}
