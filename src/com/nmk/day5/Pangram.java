package com.nmk.day5;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        HashSet hs = new HashSet();
        
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        
        char[] inputChar = inputStr.toCharArray();
        
    
   /* equivalent of for each items    
    *      for( int i = 0; i < inputChar.length; i++){
    *        System.out.println("char item--> " +inputChar[i] );
    *        }
    */ 
     
        
        
         for( char item : inputChar){
            //System.out.println("char item--> " + item );
            if(Character.isLetter(item)) {
            hs.add(Character.toLowerCase(item)); 
          }
        }
        
        //System.out.println(" hasset size--> " + hs.size());
        //System.out.println("hash set--> " +hs);
      
        if (hs.size() == 26) {
           System.out.println("pangram");
        } else {
           System.out.println("not pangram");
        }
        
        
    }
}
