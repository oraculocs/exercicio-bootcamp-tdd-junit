package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	//Primeiro Teste
	@Test
	public void entryShouldReturnTwentyPercentOfTotalAmount() {

		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 20000.0;

		double result = f.entry();

		Assertions.assertEquals(expectedValue, result);

	}

	//Segundo Teste
	@Test
	public void quotaShouldReturnCorrectQuotaValue() {

		Financing f = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 1000.0;

		double result = f.quota();

		Assertions.assertEquals(expectedValue, result);

	}

	//Terceiro Teste
	@Test
	public void constructorShouldSetValuesWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}

	//Quarto Teste
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 79);

		});
	}

	//Quinto Teste
	@Test
	public void setTotalAmountShouldSetValueWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		f.setTotalAmount(90000.0);

		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}

	//Sexto Teste
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});
	}

	//Sétimo Teste
	@Test
	public void setIncomeShouldSetValueWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		f.setIncome(3000.0);

		Assertions.assertEquals(3000.0, f.getIncome());
	}

	//Oitavo Teste
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1500.0);
		});
	}

	//Nono Teste
	@Test
	public void setMonthsShouldSetValuesWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setMonths(81);

		Assertions.assertEquals(81, f.getMonths());
	}

	//Décimo Teste
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(1100000.0, 2000.0, 80);
			
			f.setMonths(79);
		});
	}
}
