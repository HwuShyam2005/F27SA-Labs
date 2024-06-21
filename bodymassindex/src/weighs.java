import java.util.Scanner;

public class weighs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the HW-BMI caalculator");
		System.out.println("==================================");
		// ENTERING HEIGHT
		System.out.println("Please enter youre height(m): ");
		double height = scan.nextDouble();
		// ENTERING WEIGHT
		System.out.println("Please enter youre weight(kg): ");
		double weight = scan.nextDouble();
		// TO FIND BMI
		double square = height * height;
		System.out.println("Youre BMI is ->" + weight / square);
        
		// YOUR HEIGHT IN FEET
		double feet = height * 0.3048 * 10;

		// YOUR WEIGHT IN POUNDS
		double pounds = weight * 0.4535 * 10;

		// THE IF CONDITION
		double BMI= weight/square;
		if (BMI < 18.5) {
			System.out.println("You are Underweight!");
		} else if (BMI > 18 && BMI < 24.9) {
			System.out.println("You are Healthy!");
		} else {
			System.out.println("You are Overweight!");
		}

		//FINAL
		System.out.println("Youre height in (meter):" + height);
		System.out.println("Youre weight in (kilograms):" + weight);
		System.out.println("Youre height in (feet):" + feet);
		System.out.println("Youre weight in (ponds):" + pounds);
		}

}
