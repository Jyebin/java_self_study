package hee;

import java.util.Scanner;

public class project01_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x1을 입력하세요 : ");
		int x1 = scanner.nextInt(); 
		System.out.print("y1을 입력하세요 : ");
		int y1 = scanner.nextInt(); 
		System.out.print("x2를 입력하세요 : ");
		int x2 = scanner.nextInt(); 
		System.out.print("y2를 입력하세요 : ");
		int y2 = scanner.nextInt();
		System.out.print("m1의 질량을 입력하세요 : ");
		double m1 = scanner.nextDouble();
		System.out.print("m2의 질량을 입력하세요 : ");
		double m2 = scanner.nextDouble();
		System.out.print("두 물체 중심의 거리를 입력하세요 : ");
		double r = scanner.nextDouble();
		
		 
		
		double F = (6.67384 * Math.pow(10, -11))*((m1*m2)/Math.pow(r,2));
		
		double distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)); 
		
		System.out.printf("두 좌표 사이의 거리 : %f\n두 물체 사이의 중력의 크기 : %f",distance,F);
		
		
		
		
	}

}
