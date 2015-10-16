package com.sevendown.sortkata.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static <T extends Comparable<T>> List<T> sort(List<T> list) {
		if(list.size() > 1) {
			List<T> leftList = list.subList(0, list.size()/2);
			List<T> rightList = list.subList(list.size()/2,list.size());
			return sort(leftList,rightList);
		} else {
			return list;
		}
	}
	
	private static <T extends Comparable<T>> List<T> sort(List<T> leftList, List<T> rightList) {

		if(leftList.size() > 1 || rightList.size() > 1) {
			if(leftList.size() > 1) {
				leftList = sort(leftList.subList(0, leftList.size()/2), leftList.subList(leftList.size()/2, leftList.size()));
			}
			if(rightList.size() > 1) {
				rightList = sort(rightList.subList(0, rightList.size()/2), rightList.subList(rightList.size()/2, rightList.size()));
			}
			return merge(leftList, rightList);
			
		} else {
			return merge(leftList, rightList);
		}
	}
	
	private static <T extends Comparable<T>> List<T> merge(List<T> leftList, List<T> rightList) {
		ArrayList<T> sortedList = new ArrayList<T>();
		int i = 0,j = 0;
		while(i < leftList.size() && j < rightList.size()) {
			if(leftList.get(i).compareTo(rightList.get(j)) <= 0) {
				sortedList.add(leftList.get(i));
				i++;
			} else {
				sortedList.add(rightList.get(j));
				j++;
			}
		}
		while(i < leftList.size()) {
			sortedList.add(leftList.get(i));
			i++;
		}
		while(j < rightList.size()) {
			sortedList.add(rightList.get(j));
			j++;
		}
		return sortedList;
	}
}
