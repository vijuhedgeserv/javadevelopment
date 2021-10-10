package com.dev.string;

public class CountVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
        int vowelCount = 0;
        int consonantCount = 0;    
       
        String str = "This is a really simple program to Execute";        
        str = str.toLowerCase();    
            
        for(int counter = 0; counter < str.length(); counter++) {        
            if(str.charAt(counter) == 'a' || str.charAt(counter) == 'e' || str.charAt(counter) == 'i' || str.charAt(counter) == 'o' || str.charAt(counter) == 'u') {
            	vowelCount++;    
            }  
            else if(str.charAt(counter) >= 'a' && str.charAt(counter)<='z') {
            	consonantCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowelCount);    
        System.out.println("Number of consonants: " + consonantCount);  
	}

}
