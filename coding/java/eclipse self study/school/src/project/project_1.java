package project;

import java.util.Scanner;

public class project_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next(); //이름 문자열 읽기
		
		System.out.print("학번을 입력하세요 : ");
		int num = scanner.nextInt(); //학번 정수형 문자열 읽기
		
		System.out.print("전공학과를 입력하세요 : ");
		String dep = scanner.next(); //학과 문자열 읽기
		
		System.out.println();
		System.out.println("학번 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("전공 학과 : " + dep);
		scanner.close();
		
	}

}