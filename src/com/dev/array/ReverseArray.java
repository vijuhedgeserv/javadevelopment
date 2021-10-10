package com.dev.array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr = new int [] {1,2,3,4,5};
    System.out.println("original array: ");
    
    for (int counter = 0; counter < arr.length; counter++) {
    	System.out.print(arr[counter]+ " ");
    	
		
	}
      System.out.println();
      System.out.println("Array in reverse order: ");
      
      for (int counter = arr.length-1; counter >= 0; counter--) {
    	  System.out.print(arr[counter] + " ");
    	  
		
	}
	}

}
