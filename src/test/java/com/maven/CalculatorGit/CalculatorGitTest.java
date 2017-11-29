package com.maven.CalculatorGit;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorGitTest {
	static final Logger LOG = Logger.getLogger(CalculatorGit.class.getName());
	
	CalculatorGit calculator = new CalculatorGit();
	
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAdd() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<10;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.Add(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	@Test
	public void testSubst() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<10;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.Substruc(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	@Test
	public void testMultiply() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<10;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
}