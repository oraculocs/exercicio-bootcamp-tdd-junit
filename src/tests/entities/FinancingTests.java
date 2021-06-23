package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {
	
	@Test
	public void entryShouldReturnTwentyPercentOfTotalAmount() {
		
		Financing f = new Financing(1000000.0, 2000.0, 80);
		double expectedValue = 20000.0;
		
		double result = f.entry();
		
		Assertions.assertEquals(expectedValue, result);
		
	}
	
	@Test
	public void quotaShouldReturnCorrectQuotaValue() {
		
		Financing f = new Financing(1000000.0, 2000.0, 80);
		double expectedValue = 1000.0;
		
		double result = f.entry();
		
		Assertions.assertEquals(expectedValue, result);
		
	}

}
