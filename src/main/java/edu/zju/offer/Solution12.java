package edu.zju.offer;

public class Solution12 {

	public double Power(double base, int exponent) {
		if (Math.abs(base - 0.0) < 0.000001 && exponent < 0) {
			throw new RuntimeException("分母为0");
		}
		if (exponent < 0) {
			return 1.0 / PowerHelp(base, -exponent);
		}
		if (exponent == 0) {
			return 1;
		}
		return PowerHelp(base, exponent);
	}

	public double PowerHelp(double base,int exponent) {
		if (exponent == 0 ) {
			return 1;
		}
		if (exponent == 1) {
			return base;
		}
		double result = PowerHelp(base, exponent >> 1);
		
		result *= result;
		if ((exponent & 1) == 1) {
			result *= base;
		}
		return result;
	}
	
	public static void main(String[] args){
		Solution12 demo = new Solution12();
		System.out.println(demo.Power(0.1, -2));
	}
}
