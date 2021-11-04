package Q1;

import Q1.StackCalculator;

public class Main {

	//was compiled and run in eclipse, I imported the book code but wasn't used for this question
	
	public static void main(String[] args) {
		StackCalculator calc = new StackCalculator();
		//does work
		calc.evaluate("( 1 + 3 )");//4
		calc.evaluate("( 3 * ( sqrt 9 ) )");//9		
		calc.evaluate("( ( 3 * ( sqrt 9 ) ) / 4 )");//2.25
		//doesn't work
		calc.evaluate("( 2 + 2 + 3 )");//is not fully parenthesized
		
		calc.evaluate("( ( 2 + 2 ) + 3 )");//is fully parenthesized
		
		//new power functionality
		calc.evaluate("( 2 ^ 2 )");//4
		calc.evaluate("( ( 2 + 1 ) ^ 3 )");//27
		
		//new mod functionality
		calc.evaluate("( 2 % 3 )");//2
		calc.evaluate("( 4 % 3 )");//1
		calc.evaluate("( ( 5 * 2 ) % 3 )");//1
	}
}
