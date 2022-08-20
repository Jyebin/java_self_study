package sec03.p129;

import java.util.Scanner;

public class p129_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("첫 번째 수: ");	
		String strNum1 = scanner.nextLine();
		System.out.print("두 번째 : ");
		String strNum2 = scanner.nextLine();
		
		if((strNum1 || strNum2) == 0 == 0.0) {
			System.out.println("결과:무한대");
		}else {
			System.out.println("결과:" + strNum1/strNum2);
		}

	}

}
