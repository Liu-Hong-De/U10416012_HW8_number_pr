//U10416012 劉宏德

import java.util.Scanner;

public class TestCalculateDouble {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		//let user input two number
		System.out.println("input the first number: ");
		String num1 = input.next();
		
		System.out.println("input the second number: ");
		String num2 = input.next();
	
		CalculateDouble calculateDouble = new CalculateDouble(num1,num2);
		
		//let user choose which behavior the user want to do
		System.out.println("Please choose the behavior: add(a)/subtract(s)/multiply(m)/divide(d)");
		char behavior = (input.next()).charAt(0);

		//do the behavior
		if (behavior == 'a' || behavior == 'A') {
			System.out.println(calculateDouble.add());
		}
		
		else if (behavior == 's' || behavior == 'S') {
			System.out.println(calculateDouble.subtract());
		}
		
		else if (behavior == 'm' || behavior == 'M') {
			System.out.println(calculateDouble.muliply());
		}
		
		else if (behavior == 'd' || behavior == 'D') {
			System.out.println("Choose the number of value after dot? (Enter 0 for no or enter the number you want)");
			
			int scale = input.nextInt();
			
			if(scale <= 0) {
				System.out.println(calculateDouble.divide());
			}
			
			else {
				calculateDouble.setScale(scale);
				System.out.println(calculateDouble.divide());
			}
		}
		
		else{
			System.out.println("Error input!!");
		}
	}
}
