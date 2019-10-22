import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MesoAsciiCalTest {
	private MesoAsciiCal asciiAverage;
	@BeforeEach
	void setUp() throws Exception {
		String stId = "NRMN";
		asciiAverage = new MesoAsciiCal(new MesoStation(stId));
	}

	@Test
	void testCalAverage() {
		
		int asciiAvg = asciiAverage.calAverage();		
		System.out.println(asciiAvg);
	}

}
