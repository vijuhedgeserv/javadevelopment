package com.dev.string;

public class CountSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;    
		String str = "Shweta said, 'She need to travel outside.' I acknowledged it !!";    
		for (int counter = 0; counter < str.length(); counter++)   
		{    
		   
		if(str.charAt(counter) == '!' || str.charAt(counter) == ',' || str.charAt(counter) == ';' || str.charAt(counter) == '.' ||  str.charAt(counter) == '?' || str.charAt(counter) == '-' ||   
		str.charAt(counter) == '\'' || str.charAt(counter) == '\"' || str.charAt(counter) == ':')   
		{    
		count++;    
		}    
		}    
		System.out.println("The number of punctuations exists in the string is: " +count);    
	}

}
