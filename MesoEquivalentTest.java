import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MesoEquivalentTest {
	MesoEquivalent mesoEqual;
	@BeforeEach
	void setUp() throws Exception {
		 mesoEqual = new MesoEquivalent("NRMN");
	}

	@Test
	void testCalAsciiEqual() throws IOException {
		mesoEqual.calAsciiEqual();
	}

	@Test
	void testmesoLexi() throws IOException {
		MesoLexicographical test = new MesoLexicographical(mesoEqual.calAsciiEqual());
	}
}
