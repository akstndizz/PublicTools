package com.smilek.publictools.util;

/**
 * 자료형 String 활용 Utils
 * @author smileK
 * @Date 18.11.28
 */
public class StringUtils {

	/**
	 * String -> Int
	 * @param str
	 * @return
	 */
	public int stringToInt(String str) {
		return (int) this.stringToLong(str);
	}
	
	/**
	 * String -> Long
	 * @param str
	 * @return
	 */
	public long stringToLong(String str) {

		long result = 0L;
		
		try {
			result = Long.parseLong(str);
		} catch (Exception e) {
			return result;
		}
		
		return result;
	}
	
	/**
	 * Double -> Long
	 * @param str
	 * @return
	 */
	public double stringToDouble(String str) {
		
		double result = 0D;

		try {
			result = Double.parseDouble(str);
		} catch (Exception e) {
			return result;
		}

		return result;
	}
	
	/**
	 * int -> String
	 * @param number
	 * @return
	 */
	public String intToString(int number) {
		return String.valueOf(number);
	}

	/**
	 * long -> String
	 * @param number
	 * @return
	 */
	public String longToString(long number) {
		return String.valueOf(number);
	}

	/**
	 * double -> String
	 * @param number
	 * @return
	 */
	public String doubleToString(double number) {
		return String.valueOf(number);
	}
}
