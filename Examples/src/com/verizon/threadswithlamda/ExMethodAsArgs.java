
package com.verizon.threadswithlamda;

/**
 * @author verizon
 *
 */
public class ExMethodAsArgs {

	
	interface FunctionCalc{
		double operation(int a , int b);
	}
	interface FunctionDisplay{
		void displayMsg(String message);
	}

	private double operate (int a, int b, FunctionCalc fobj ){
		return fobj.operation(a, b);		
	}
	public static void main(String[] args) {		
		FunctionCalc add = (int a, int b) ->{ 
			System.out.println( a+b);
			return  a+b;
			};
		FunctionCalc mul = (int a, int b) -> a*b;
		FunctionCalc sub = (int a, int b) -> a-b;	
		FunctionCalc div = (int a, int b) -> a/b;				
		ExMethodAsArgs obj = new ExMethodAsArgs();
		System.out.println("Addition " +obj.operate(7, 5, add));
		System.out.println("Sub " +obj.operate(7, 5, sub));
		System.out.println("Mul " +obj.operate(7, 5, mul));
		System.out.println("Div " +obj.operate(5, 5, div));
		FunctionDisplay display = (String message)->{
			System.out.println(message);
		};
		display.displayMsg("Hello");
	}

	
	}
