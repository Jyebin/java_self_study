package sec02.p99;

import java.util.Scanner;

public class p99 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");	
		String strNum1 = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String strNum2 = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String strNum3 = scanner.nextLine();
		
		
		System.out.println("[입력한 내용]");
		System.out.println(strNum1 +"\n"+ strNum2+"\n" + strNum3);
		
		

	}

}
