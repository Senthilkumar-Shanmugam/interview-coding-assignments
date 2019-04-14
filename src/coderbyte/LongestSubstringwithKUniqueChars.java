package coderbyte;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * function KUniqueCharacters(str) take the str parameter being passed and find the longest substring that contains k unique characters, where k will be the first character from the string. The substring will start from the second position in the string because the first character will be the integer k. For example: if str is "2aabbacbaa" there are several substrings that all contain 2 unique characters, namely: ["aabba", "ac", "cb", "ba"], but your program should return "aabba" because it is the longest substring. If there are multiple longest substrings, then return the first substring encountered with the longest length. k will range from 1 to 6. 
Sample Test Cases
Input:"3aabacbebebe"

Output:cbebebe

Input:"2aabbcbbbadef"

Output:bbcbbb
 * @author seshshan
 *
 *******************************************************/
public class LongestSubstringwithKUniqueChars {
	
	  public static String KUniqueCharacters(String str) { 
			final int CHAR_RANGE = 128;
		    
			
			//pointers that will store that start and end positions of longest substring
			int start=1,end=1;
			
			Set<Character> dstCharWindow = new HashSet<>();
			int [] frq = new int[CHAR_RANGE]; // array to hold frequn in the window
		    int k = Character.getNumericValue(str.charAt(0));
		    
		    
		    //sliding window logic
		    //start at index 1 , since char at 0 has k
		    for(int low = 1, high = 1; high < str.length();high++) {
		    	dstCharWindow.add(str.charAt(high));
		    	frq[str.charAt(high)]++;
		    	
		    	while(dstCharWindow.size() > k) //if the window has more than k remove chars from the low
		    	{
		    		if(--frq[str.charAt(low)] == 0)
		    			dstCharWindow.remove(str.charAt(low));
		    		low++;
		    	}
		    	
		    	
		    	if(end- start < high-low)
		    	{
		    		end = high;
		    		start = low;
		    	}
		    }
	    	return str.substring(start, end+1);
 	  }
	
	
	
	 public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    System.out.print(KUniqueCharacters(s.nextLine())); 
		  }

}
