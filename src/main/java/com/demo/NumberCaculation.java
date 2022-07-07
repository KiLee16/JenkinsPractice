package com.demo;

/**
 * @author : Ki Beom Lee
 * @time : 2022. 3. 10.-¿ÀÀü 11:52:36
 */
public class NumberCaculation extends Demo {
	public NumberCaculation(){
		
	}
	public int add(int a , int b) {
		
		return a + b ;
	}
	
	
	
	public String converCase(String str) {
//		for(int i = 0 ; i < str.length() ; i++) {
//			int x = str.charAt(i);
//			String s = str.toUpperCase()
//		}
		String s = str.toUpperCase();
		return s;
		

	}
	
	public static void main(String[] args) {
		int x = 20 ; 
//		do {
//			if(x %2 == 0) {
//				x /= 2;
//				System.out.print(x + " ");
//			} else {
//				x = x *3 + 1 ;
//				System.out.print(x + " ");
//			}
//		} while (x !=1 );
		
		NumberCaculation calc = new NumberCaculation();
		
		calc.test();
	}
	
	
	public static void test() {
		System.out.println("test from child");
	}
	
	
}
