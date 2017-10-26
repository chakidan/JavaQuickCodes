package com.my.learn.functionalp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FunctionalProgram {

	public static List<Integer> oneToFive = Arrays.asList(1, 2, 3, 4, 5);
	
	
	public static void main(String[] args) {
		List<Integer> multipliedByTwo = oneToFive.stream()
		        .map((num) -> {
		            return num * 2;
		        })
		        .collect(Collectors.toList());

		System.out.println("multipliedByTwo = " + multipliedByTwo);
		// multipliedByTwo = [2, 4, 6, 8, 10]
		
		
		List<Integer> noNumbers = Arrays.asList();
		Optional<Integer> sumOfNothing = noNumbers.stream()
		        .reduce((num, acc) -> num + acc);
		System.out.println("sumOfNothing = " + sumOfNothing);
		
		
	}

}
