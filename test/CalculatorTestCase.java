import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTestCase {
	
	@Test
	public void testZeroValues(){
		Calculator calc = new Calculator();
		String val = "";	
		
		assertEquals(0, calc.Add(val)); 
	}

	
}
