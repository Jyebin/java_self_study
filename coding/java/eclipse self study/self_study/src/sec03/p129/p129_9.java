package sec03.p129;

import java.util.Scanner;

public class p129_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 수: ");	
		double num1 = Double.parseDouble(scanner.nextLine());
		System.out.print("두 번째 수: ");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		if(num2 == 0.0) {
			System.out.println("결과:무한대");
		}else {
			System.out.println("결과:" + (num1/num2));
		}

	}

}
