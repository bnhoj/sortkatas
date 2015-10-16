package com.sevendown.sortkata.quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSort {
	public static <T extends Comparable<T>> List<T> sort(List<T> list) {
		if(list.size() <= 1) {
			return list;
		}
		T pivot = pivot(list);
		List<T> smallerThanPivot = smallerThanPivot(list, pivot);
		List<T> equalToPivot = equalToPivot(list, pivot);
		List<T> largerThanPivot = largerThanPivot(list, pivot);
		List<T> result = new ArrayList<T>(smallerThanPivot.size() + equalToPivot.size() + largerThanPivot.size());
		result.addAll(sort(smallerThanPivot));
		result.addAll(sort(equalToPivot));
		result.addAll(sort(largerThanPivot));
		return result;
	}

	private static <T extends Comparable<T>> T pivot(List<T> list) {
		return list.get(list.size()-1);
	}

	private static <T extends Comparable<T>> List<T> smallerThanPivot( List<T> list, T pivot) {
		return list.stream()
				.filter(item -> item.compareTo(pivot) < 0)
				.collect(Collectors.toList());
	}
	private static <T extends Comparable<T>> List<T> equalToPivot( List<T> list, T pivot) {
		return list.stream()
				.filter(item -> item.compareTo(pivot) == 0)
				.collect(Collectors.toList());
	}
	private static <T extends Comparable<T>> List<T> largerThanPivot( List<T> list, T pivot) {
		return list.stream()
				.filter(item -> item.compareTo(pivot) > 0)
				.collect(Collectors.toList());
	}
}