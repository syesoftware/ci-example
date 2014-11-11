import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class CalculatorTestCase {
	Calculator calc;

	@Before
	public void setup(){
		calc = new Calculator();
	}
	
	@Test
	public void testZeroValues(){
		
		String val = "";	
		
		assertEquals(0, calc.Add(val)); 
	}

	@Test
	public void testOneValueAdd(){
		String val = "10,20";

		assertEquals(30,calc.Add(val));
	}

	
}
