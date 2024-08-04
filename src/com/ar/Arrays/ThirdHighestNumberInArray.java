package com.ar.Arrays;

import java.util.Arrays;

public class ThirdHighestNumberInArray {
	public static void main(String[] args) {
		int[] array = { 12, 3, 24, 55, 67, 77 };

		//creates a stream of int values from the given int array
		int thirdHighestArray = Arrays.stream(array)
				//converts each int element of the stream into its corresponding boxed type (Integer).
				//This is necessary because the subsequent ope0rations (sorted, distinct, etc.)
				//work with objects, not primitives.
						.boxed()
						.sorted((a, b) -> b - a)
						.distinct().skip(2)
						.findFirst()
						.orElseThrow(() -> new IllegalArgumentException("Array is too short"));

		System.out.println(thirdHighestArray);
	}
}
