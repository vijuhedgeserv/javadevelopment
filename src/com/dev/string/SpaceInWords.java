package com.dev.string;

public class SpaceInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   String str = "vijendra mahajan";
   System.out.println("Original Name: " +str);
   
  System.out.println("Changed name dispayed as: ");
   for (int counter = 0; counter <= str.length() -1; counter++) {
	   System.out.print(str.charAt(counter)+ " ");
}
	}

}
