package sec04.exam05;

import java.util.Scanner; //improt문. scanner가 java.util 패키지에 있다는 것을 컴파일러에게 알려주는 역할을 함.

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) { //문자열이 동일한지 비교할 때는 equals() 메소드 사용
				break;
			}
		}
		System.out.println("종료");

	}

}
