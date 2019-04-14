package coderbyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class FindLongestSubstring {  
	  public static String KUniqueCharacters(String str) { 
	    
	    int uCnt = 0;
	    Map<Integer,String> oMap = new TreeMap<>();
	    List<Character> uList = new ArrayList<>();
	    int k = Character.getNumericValue(str.charAt(0));
	    System.out.println(k);
	    
	    StringBuffer tmp = new StringBuffer();
	    for(int idx=1;idx<str.length();idx++){
	        
	        char chr = str.charAt(idx);
	        
	        if(uList.contains(chr)){
	            tmp.append(chr);
	        }else{
	            uList.add(chr);
	            tmp.append(chr);
	            uCnt++;
	           
	            //if alredy unique count reached then start a new Cloneable
	            
	            if(uCnt==k){
	                oMap.put(tmp.length(),tmp.toString());
	                tmp = new StringBuffer();
	                uCnt=0;
	            }
	            
	        }
	    } 
	     
	      for(Entry<Integer,String> entry    :oMap.entrySet()) 
	    	  System.out.println(entry.getKey()+":"+entry.getValue());
	    
	      return null;
	  }
	    
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(KUniqueCharacters(s.nextLine())); 
	  }   
	  
	}
