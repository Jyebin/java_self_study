package hee;

import java.util.Scanner;

public class project01_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("습도를 입력하세요 : ");
		double Humid = scanner.nextDouble(); //습도 입력받기
		
		System.out.print("온도를 입력하세요 : ");
		double Temp = scanner.nextDouble(); //온도 입력받기
		
		double DewPoint = (243.12*(Math.log(Humid/100)+((17.62*Temp)/(243.12+Temp)))) / (17.62-(Math.log(Humid/100)+((17.62*Temp)/(243.12+Temp))));
		double answer = ((int)(DewPoint*10))/10.0;
		System.out.printf("%.1f", answer);
		

	}

}
