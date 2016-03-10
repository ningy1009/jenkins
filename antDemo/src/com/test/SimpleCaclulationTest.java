package com.test;

import static org.junit.Assert.*;
import com.SimpleCalculation;
import org.junit.Test;

public class SimpleCaclulationTest {
	SimpleCalculation sc = new SimpleCalculation();

	@Test
	 public void AddTest() {
        
        int c = sc.Add(3, 5);    
        
        assertEquals(8, c);        
    }
}
