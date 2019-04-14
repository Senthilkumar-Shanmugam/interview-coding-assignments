package coderbyte;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindFirstNonRepeatingCharacter {  
  public static String NonrepeatingCharacter(String str) { 
	  Map<Character,Integer> cMap = new LinkedHashMap<>();
	  
	  for(char c : str.toCharArray()){
	      cMap.put(c,cMap.containsKey(c) ? cMap.get(c) + 1 :1);
	  }
	       
	       //iterate and return the fisrt one with count 1
	       
	    for(Entry<Character,Integer> entry  :cMap.entrySet()){
	        if(entry.getValue()==1)
	          return entry.getKey().toString();
	        
	    }
	       
	    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(NonrepeatingCharacter(s.nextLine())); 
  }   
  
}
