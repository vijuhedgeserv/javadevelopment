package com.dev.string;

public class DivideString {

	public static void main(String[] args) {  
        String str = "aaaabbbbcccc";  
        
      //Stores the length of the string  
      int len = str.length();  
      //n determines the variable that divide the string in 'n' equal parts  
      int n = 3;  
      int count = 0;
      int chars = len/n;  
      //Stores the array of string  
      String[] equalStr = new String [n];  
      //Check whether a string can be divided into n equal parts  
      if(len % n != 0) {  
          System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
      }  
      else {  
          for(int counter = 0; counter < len; counter = counter+chars) {  
              //Dividing string in n equal part using substring()  
              String div = str.substring(counter, counter+chars);  
              equalStr[count] = div;  
              count++;  
          }  
  System.out.println(n+ " equal parts of given string are ");  
          for(int counter = 0; counter < equalStr.length; counter++) {  
              System.out.println(equalStr[counter]);  
              }  
          }  
      }  
}  