	package com.learning.DSA;
	
	import java.util.Scanner;
	import java.util.Stack;
	
	public class BalancedBrackets {
	    public static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       
	       System.out.println("Please enter Input String");
	       String str= sc.nextLine();
	       char[] ch=str.toCharArray();
	       
	       if(isBalancedBracket(ch) ) {
	    	   System.out.println("This is balanced bracket expression");
	       } else {
	    	   System.out.println("Not a balanced bracket expression");
	       }
	  }
		
		public static boolean isBalancedBracket(char[] ch) {
			 Stack<Character> stc = new Stack<>();
		       
		       boolean flag=false;
		       for(int i=0; i<ch.length; i++) {
		    	   if( ch[i] == '(' ||  ch[i] == '{' || ch[i] == '['  ) {
		    		   stc.push(ch[i]);
		    	   }
		    	   if (ch[i] == ')' ||  ch[i] == '}' || ch[i] == ']') {
		    		   if(stc.isEmpty()) {
		    			  return false;
		    		   } else {
		    			   stc.pop();
		    		   }
		    	   }
		     }
		    return stc.isEmpty() ? true:false;
		   }
}
		
