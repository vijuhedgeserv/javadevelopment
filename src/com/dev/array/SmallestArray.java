package com.dev.array;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr = new int [] {25, 11, 15};
     int min = arr[0];
     
    for (int counter = 0; counter < arr.length; counter++) {
		if(arr[counter] < min) {
			min = arr[counter];
	}		
		System.out.println("Smallest Element in the given list is :" +min);
	}
     
	}

}	
