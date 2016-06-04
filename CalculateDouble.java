//U10416012 劉宏德

import java.math.*;

public class CalculateDouble {

	int scale = 20;
	
	//create two BigDecimal to store the input number
	BigDecimal number1;
	BigDecimal number2;

	public CalculateDouble() {
	}

	public CalculateDouble(double num1, double num2) {
		setNum1(num1);
		setNum2(num2);
	}

	//create a constructor with String parameters
	public CalculateDouble(String number1, String number2) {
		setNumber1(number1);
		setNumber2(number2);
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
}
