package com.alykhantejani.fraction;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTests {

	@Test 
	public void add(){
		Fraction a = new Fraction(5, 4);
		Fraction b = new Fraction(3, 4);

		Fraction result = Fraction.add(a, b);
		
		assertEquals(8.0, result.getNumerator(),0);
		assertEquals(4.0, result.getDenominator(),0);
		
		Fraction c = new Fraction(1, 3);
		result = Fraction.add(a, c);
		assertEquals(19.0, result.getNumerator(), 0);
		assertEquals(12.0, result.getDenominator(), 0);
		
		result = Fraction.add(a,b,c);
		
		assertEquals(28.0, result.getNumerator(), 0);
		assertEquals(12.0, result.getDenominator(), 0);
	}
	
	@Test
	public void subtract(){
		Fraction a = new Fraction(5, 4);
		Fraction b = new Fraction(3, 4);

		Fraction result = Fraction.subtract(a, b);
		
		assertEquals(2.0, result.getNumerator(),0);
		assertEquals(4.0, result.getDenominator(),0);
		
		Fraction c = new Fraction(1, 3);
		result = Fraction.subtract(a, c);
		assertEquals(11.0, result.getNumerator(), 0);
		assertEquals(12.0, result.getDenominator(), 0);
		
		result = Fraction.subtract(a,b,c);
		
		assertEquals(2.0, result.getNumerator(), 0);
		assertEquals(12.0, result.getDenominator(), 0);
	}
	
	@Test
	public void multiply(){

		Fraction a = new Fraction(5, 4);
		Fraction b = new Fraction(3, 4);

		Fraction result = Fraction.multiply(a, b);
		
		assertEquals(15.0, result.getNumerator(),0);
		assertEquals(16.0, result.getDenominator(),0);
		
		Fraction c = new Fraction(1, 3);
		result = Fraction.multiply(a, c);
		assertEquals(5.0, result.getNumerator(), 0);
		assertEquals(12.0, result.getDenominator(), 0);
		
		result = Fraction.multiply(a,b,c);
		
		assertEquals(15.0, result.getNumerator(), 0);
		assertEquals(48.0, result.getDenominator(), 0);
	}
	
	@Test
	public void divide(){
		Fraction a = new Fraction(5, 4);
		Fraction b = new Fraction(3, 4);

		Fraction result = Fraction.divide(a, b);
		
		assertEquals(20.0, result.getNumerator(),0);
		assertEquals(12.0, result.getDenominator(),0);
		
		Fraction c = new Fraction(1, 3);
		result = Fraction.divide(a, c);
		assertEquals(15.0, result.getNumerator(), 0);
		assertEquals(4.0, result.getDenominator(), 0);
	}
}
