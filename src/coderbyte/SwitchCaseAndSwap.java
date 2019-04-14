package coderbyte;

import java.util.Scanner;

public class SwitchCaseAndSwap {
	
	public static String SwapII(String str) { 
		StringBuffer output = new StringBuffer();
		boolean swap = false;
		int pos1=-1,pos2=-1;
		
	     for(int i=0;i<str.length();i++) {
	    	 char c = str.charAt(i);
	    	 
	    	 if(Character.isLetter(c))
	    	 {
	    		 if(Character.isLowerCase(c))
	    			 output.append(Character.toUpperCase(c));
	    		 else
	    			 output.append(Character.toLowerCase(c));
	    		 
	    		 if(pos1 != -1)
	    			 swap = true;
	    		 
	    	 }else if(Character.isDigit(c)) {
	    		 output.append(c);
	    		 
	    		if(!swap) {
	    			pos1=pos2=-1;
	    		}
	    		
	    		if(pos1 == -1)
	    			pos1= i;
	    		else
	    			pos2=i;
	    		
	    		if(pos1 != -1 && pos2 != -1) { //swap numbers
	    			char tmp = str.charAt(pos1);
	    			output.setCharAt(pos1, str.charAt(pos2));
	    			output.setCharAt(pos2, tmp);
	    			pos1=-1;
	    			pos2=-1;
	    		}
	    	 }else {
	    		 output.append(c);
	    		 
	    		 if(pos1 !=-1) {
	    			 pos1=-1;
	    			 pos2=-1;
	    		 }
	    	 }
	     }
		return output.toString();
	 }
	
	
	public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(SwapII(s.nextLine())); 
  }

}
