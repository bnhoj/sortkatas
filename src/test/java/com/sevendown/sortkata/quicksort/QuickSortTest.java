package com.sevendown.sortkata.quicksort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class QuickSortTest {
	@Test
	public void test_sort_list_with_2_unsorted_items() {
		List<Integer> unsortedList = Arrays.asList(2,1);

		List<Integer> expectedResult = Arrays.asList(1,2);

		assertEquals(expectedResult,QuickSort.sort(unsortedList));
	}

	@Test
	public void test_sort_list_with_2_sorted_items() {
		List<Integer> sortedList = Arrays.asList(1,2);

		List<Integer> expectedResult = Arrays.asList(1,2);

		assertEquals(expectedResult,QuickSort.sort(sortedList));
	}

	@Test
	public void test_sort_list_with_3_unsorted_items() {
		List<Integer> unsortedList = Arrays.asList(3,2,1);

		List<Integer> expectedResult = Arrays.asList(1,2,3);

		assertEquals(expectedResult,QuickSort.sort(unsortedList));
	}

	@Test
	public void test_sort_list_with_10_unsorted_items() {
		List<Integer> unsortedList = Arrays.asList(100,10000,1000,999,1000000,9999,10,3,1,-10);

		List<Integer> expectedResult = Arrays.asList(-10,1,3,10,100,999,1000,9999,10000,1000000);

		assertEquals(expectedResult,QuickSort.sort(unsortedList));
	}
}
