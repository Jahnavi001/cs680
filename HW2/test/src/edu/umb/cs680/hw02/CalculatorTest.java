package  edu.umb.cs680.hw02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

	@Test
	public void addition()
	{
		Calculator cal = new Calculator();
		float actual = cal.add(5,6);
		float expected = 11;
		assertEquals(actual, expected);
	}
	
	@Test
	public void substraction()
	{
		Calculator cal = new Calculator();
		float actual = cal.sub(6,5);
		float expected = 1;
		assertEquals(actual, expected);
	}
	
	@Test
	public void multiplication()
	{
		Calculator cal = new Calculator();
		float actual = cal.mul(5,6);
		float expected = 30;
		assertEquals(actual, expected);
	}
	
	@Test
	public void multiplication1()
	{
		Calculator cal = new Calculator();
		float actual = cal.mul(1.5f,2.5f);
		float expected = 3.75f;
		assertEquals(actual, expected);
	}
	@Test
	public void division()
	{
		Calculator cal = new Calculator();
		float expected = 2.2f;
		float actual = cal.div(5.5f,2.5f);
		assertEquals(actual, expected); 
	}
	
	
	@Test
	public void divideBy0()
	{
		Calculator cal = new Calculator();
		Assertions.assertThrows(IllegalArgumentException.class, () -> cal.div(7, 0));
	}
}	