package helloworld;

import java.lang.Math;

/**
 * This class includes methods
 * 
 * @author Raisa Antonia Gagas
 * 
 * */
public class Calculator {
	Calculator(){
		
	}
	
/**
 * This class includes public ints and public doubles
 * 
 * @author Raisa Antonia Gagas
 * */
	public int addition (int num1, int num2) {
	return num1+num2;
		}
		
	public int squared (int num1) {
		return num1*num1;
		
	}
	
	public double pythagorianTheorem(int a, int b) {
		return Math.sqrt(this.squared(a)+this.squared(b));
		
		
		
	} 

	public double quadraticFormulaPos(int a, int b, int c) {
		return b*(-1)+ Math.sqrt(this.squared(b)- 4*(a)*(c)/(2)*(a));
		
	
		
		
	}
	public double quadraticFormulaNeg(int a, int b, int c) {
		return b*(-1)+ Math.sqrt(this.squared(b)- 4*(a)*(c)/(2)*(a));
	
}}

	
	
	


