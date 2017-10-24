package com.kinfinite.fectorial;

import java.util.stream.Stream;
import java.math.BigInteger;

public class Fectorial {

	public static void main(String[] args) {
		
		if(checkValidInput(args[0]))
		{		
			// Factorial for function
			BigInteger fect = Stream.iterate(1, i->i+1)
									.map(BigInteger::valueOf)
									.limit(Integer.parseInt(args[0]))
									.reduce(BigInteger.valueOf(1), (t,n)->t.multiply(n));
			
			//sum of factorial answer
			int finalAnswer = fect.toString()
									.chars()
									.mapToObj(Character::getNumericValue)
									.reduce(0,(i,j)-> i+j);
											 
			System.out.println(finalAnswer);									
			
		} else {
			System.out.println("Invalid input value");
		}
	}
	/**
	 * Check the validity of input value
	 * @return
	 */
	private static boolean checkValidInput(String input)
	{
		try
		{
			int value =Integer.parseInt(input);
			return value<1700 && value >0;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}

}
