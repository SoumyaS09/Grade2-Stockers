package com.gl.stockers.service;

public class BinarySearchStock {
	
	public void searchValue(double array[], double value) {
		int l = 0;
		int r = array.length - 1;
		int mid = l + (r - l) / 2;
		while (l <= r) {
			if (value < array[mid]) {
				// range is l to mid-1
				r = mid - 1;
			} else if (value > array[mid]) {
				// range is mid+1 to r
				l = mid + 1;
			} else {
				System.out.println("Stock of value " + value + " is present ");
				break;
			}
			mid = l + (r - l) / 2;
		}
		if (l > r) {
			System.out.println("Value not found");
		}
	}
}
