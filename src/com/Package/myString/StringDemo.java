package com.Package.myString;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "Welcome to Java";
			
			String ss ="Welcome to Java";
			
			System.out.println(s.replace("Java", "python"));
			
			//changes
			//String a = s + i; 
			 String a = s.concat(ss);  
	          System.out.println(a + "\n ");
	         
	         System.out.println(a.charAt(10));
	         
	         System.out.println(ss.substring(5,15));
			
	         System.out.println( " position of G is: "+ss.indexOf('G'));
	         
	          System.out.println(ss.toUpperCase());
	          
	          int l = ss.length();
	          
	          
	          System.out.println(l);
	          
	          String c = "haseeb";
	          
	          boolean  b = c.isEmpty();
	          System.out.println(b);
	          
	          System.out.println(ss.trim());
	          boolean  x =  s.equals(ss);
	          System.out.println(x);
	          
	}

}
