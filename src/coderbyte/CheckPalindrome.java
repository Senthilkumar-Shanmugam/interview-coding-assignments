package coderbyte;

import java.util.*; 

public class CheckPalindrome {  
 public static String PalindromeTwo(String str) { 
 
   str = str.replace(" ","");
   str = str.replaceAll("[\\-]","");
   str = str.toLowerCase();
   
   String rev = new StringBuilder(str).reverse().toString();
   
   System.out.println("rev:"+rev);
   if(str.equals(rev))
     return "true";
      
   return "false";
   
 } 
 
 public static void main (String[] args) {  
   // keep this function call here     
   Scanner s = new Scanner(System.in);
   System.out.print(PalindromeTwo(s.nextLine())); 
 }   
 
}


 