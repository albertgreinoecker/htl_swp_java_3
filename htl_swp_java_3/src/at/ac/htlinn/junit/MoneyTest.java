package at.ac.htlinn.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
@author albert
Ablauf:
setUpBeforeClass
setUp
testAddDifferentCurrency
tearDown
setUp
testAddSameCurrency
tearDown
tearDownAfterClass
 */
class MoneyTest {

	Money m1 = null;
	Money m2 = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		m1 = new Money("EUR", 10);
		m2 = new Money("EUR", 20);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddSameCurrency()
	{
		Money m3 = m1.add(m2);
		assertEquals(m3, new Money("EUR", 30));
	}
	@Test
	void testAddDifferentCurrency() {
		Money m3 = m1.add(m2);
		assertNull(m3);

		Money m4 = new Money("USD", 10);
		Money m5 = new Money("EUR", 20);		
		Money m6 = m4.add(m5);
		assertNull(m6);
		
	}

}
