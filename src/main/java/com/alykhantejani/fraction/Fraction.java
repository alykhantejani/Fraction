package com.alykhantejani.fraction;

public class Fraction {

	private double numerator;
	private double denominator;

	public Fraction(double n, double d) {
		numerator = n;
		denominator = d;
	}

	public double toDouble() {
		return ((double) numerator) / ((double) denominator);
	}

	public double getNumerator(){
		return numerator;
	}
	
	public double getDenominator(){
		return denominator;
	}
	
	public static Fraction add(Fraction a, Fraction b) {
		if (a.denominator != b.denominator) {
			double aTop = b.denominator * a.numerator;
			double bTop = a.denominator * b.numerator;
			return new Fraction(aTop + bTop, a.denominator * b.denominator);
		} else {
			return new Fraction(a.numerator + b.numerator, a.denominator);
		}
	}

	public static Fraction add(Fraction a, Fraction b, Fraction... fractions){
		Fraction result = Fraction.add(a, b);
		for(Fraction c : fractions){
			result = Fraction.add(result, c);
		}
		return result;
	}
	
	public static Fraction subtract(Fraction a, Fraction b) {
		if (a.denominator != b.denominator) {
			double aTop = b.denominator * a.numerator;
			double bTop = a.denominator * b.numerator;
			return new Fraction(aTop - bTop, a.denominator * b.denominator);
		}
		else {
			return new Fraction(a.numerator - b.numerator, a.denominator);
		}
	}
	
	public static Fraction subtract(Fraction a, Fraction b, Fraction...fractions){
		Fraction result = Fraction.subtract(a, b);
		for(Fraction c : fractions){
			result = Fraction.subtract(result, c);
		}
		return result;		
	}


	public static Fraction multiply(Fraction a, Fraction b) {
		return new Fraction(a.numerator * b.numerator, a.denominator * b.denominator);
	}
	
	public static Fraction multiply(Fraction a, Fraction b, Fraction... fractions){
		Fraction result = Fraction.multiply(a, b);
		for(Fraction c : fractions){
			result = Fraction.multiply(result, c);
		}
		return result;		
	}
	
	public static Fraction divide(Fraction a, Fraction b) {
		return new Fraction(a.numerator * b.denominator, a.denominator
				* b.numerator);
	}

	
}
