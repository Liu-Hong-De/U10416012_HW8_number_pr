//U10416012 劉宏德

import java.math.*;

public class CalculateDouble {

	int scale = 20;
	
	//create two BigDecimal to store the input number
	BigDecimal num1;
	BigDecimal num2;

	public CalculateDouble() {
	}

	public CalculateDouble(double num1, double num2) {
		setNum1(num1);
		setNum2(num2);
	}

	public CalculateDouble(String num1, String num2) {
		setNum1(num1);
		setNum2(num2);
	}
	
	//set num1
	public void setNum1(double num) {
		this.num1 = new BigDecimal(num);
	}

	//set num2
	public void setNum2(double num) {
		this.num2 = new BigDecimal(num);
	}

	//set num1 to String
	public void setNum1(String num) {
		this.num1 = new BigDecimal(num);
	}

	//set num2 to String
	public void setNum2(String num) {
		this.num2 = new BigDecimal(num);
	}

	//set scale
	public void setScale(int scale) {
		this.scale = scale;
	}
	
	//add number
	public String add() {
		return String.valueOf(num1.add(num2));
	}

	//subtract number
	public String subtract() {
		return String.valueOf(num1.subtract(num2));
	}

	//multiply number
	public String muliply() {
		return String.valueOf(num1.multiply(num2));
	}

	//divide number
	public String divide() {
		return String.valueOf(num1.divide(num2, scale, BigDecimal.ROUND_HALF_UP));
	}
}
