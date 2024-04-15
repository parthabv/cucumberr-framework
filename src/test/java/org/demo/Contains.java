package org.demo;

import org.junit.Assert;

public class Contains {
	
	public static void main(String[] args) {
		String s= "Hotel Hyatt Regency Chennai is booked!";
//		boolean contains = s.contains("Hotels");
//		Assert.assertFalse(false);
		
		String[] split = s.split(" ");
		
		StringBuilder builder = new  StringBuilder();
		StringBuilder append = builder.append(split[1]).append(' ').append(split[2]).append(' ').append(split[3]);
//	for (String string : split) {
//		if (string.equals("Book")||(string.equals("Hotel"))) {
//			
//		String join = String.join(" ",string);
//		System.out.println(join);
//
//		}
//	}
//		
		System.out.println(append);
			
		}
		

}
