package book;

import java.util.Scanner;

public class p106 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("철수 >> ");
		String kind = scanner.next();
		System.out.print("영희 >> ");
		String kind2 = scanner.next();
		if(kind.equals("가위")) {
			if(kind2.equals("가위")) {
				System.out.print("비겼습니다.");
			}else if(kind2.equals("바위")) {
				System.out.print("영희가 이겼습니다.");
			}else {
				System.out.print("철수가 이겼습니다.");
			}
		}else if(kind.equals("바위")) {
			if(kind2.equals("바위")) {
				System.out.print("비겼습니다.");
			}else if(kind2.equals("보")) {
				System.out.print("영희가 이겼습니다.");
			}else {
				System.out.print("철수가 이겼습니다.");
			}
		}else {
			if(kind2.equals("보")) {
				System.out.print("비겼습니다.");
			}else if(kind2.equals("가위")) {
				System.out.print("영희가 이겼습니다.");
			}else {
				System.out.print("철수가 이겼습니다.");
			}
		}
	}

}
