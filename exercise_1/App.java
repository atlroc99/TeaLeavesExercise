package com.test.tea.leaves;

import java.util.Iterator;
import java.util.TreeSet;

public class App {

	/**
	 * 1) Write a Java method call sortUnique that takes an array of strings as
	 * an input and returns an array sorted with any duplicates removed. Your
	 * solution should be case insensitive in respect to sorting and duplicate
	 * detection.
	 **/

	public static void main(String[] args) {
		String[] values = { "green", "Red", "grEeN", "Blue", "yellow", "z@2faf33",
							"Green", "BLUE", "YelloW", "YELLow", "adeline",
							"Yellow", "Black", "black", "BLACK", "2343", "@2faf33"};

		String[] sortedValues = sortUnique(values);
		for (String s : sortedValues) {
			System.out.println(s);
		}
	}

	public static String[] sortUnique(String[] colors) {
		
		String[] colorArray = null;
		
		if (colors != null && colors.length > 0) {
			
			TreeSet<String> treeSet = new TreeSet<String>();
			
			for (String color : colors) {
				treeSet.add(color.substring(0, 1).toUpperCase().concat(color.substring(1).toLowerCase()));
			}
			
			Iterator<String> setIteraor = treeSet.iterator();
			colorArray = new String[treeSet.size()];
			int i = 0;
			
			while (setIteraor.hasNext() && i < colorArray.length) {
				colorArray[i++] = setIteraor.next();
			}
		} else {
			colorArray = new String[] { "empty array" };
		}

		return colorArray;
	}
}