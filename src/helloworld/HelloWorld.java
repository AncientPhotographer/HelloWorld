package helloworld;
/** 
 * This  compares the priority of each autopath, the required
 * 
 * */
public class HelloWorld {
	
	static Object object = new Object();
	static Object objectTwo = new Object(5);
	static Operations operations = new Operations();
	static Calculator calculator = new Calculator();
	
	public static void main(String[] args) {
		System.out.println(object.getVariable());		
		System.out.println(objectTwo.getVariable());		
		operations.addition(1,2);
		System.out.println(operations.addition(1, 2));
		operations.subtraction(1,2);
		System.out.println(operations.subtraction(1,2));
		operations.mutiplication(1,2);
		System.out.println(operations.mutiplication(1,2));
		operations.division(1,2);
		System.out.println(operations.division(1,2));
		operations.squared(1);
		System.out.println(operations.squared(1));
		calculator.addition(1,2);
		System.out.println(calculator.addition(1,2));
		calculator.squared(1);
		System.out.println(calculator.squared(1));
		System.out.println(calculator.pythagorianTheorem(2,2));
		System.out.println(calculator.quadraticFormulaPos(1, 2, 3));
	}
	
}

