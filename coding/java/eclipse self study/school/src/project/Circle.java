package project;
import java.util.Scanner;
public class Circle {
	int radius; //원의 반지름 필드
	String name; //원의 이름 필드
	
	public Circle() {} //원의 생성자 
	
	public double getCircumference() { //원의 둘레 계산 메소드
		return 3.14*2*radius;
	}
	
	public double getArea() { //원의 넓이 계산 메소드
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		//첫 번째 원
		Circle circle;
		circle = new Circle();
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 이름을 입력하세요 : ");
		String name = scanner.next(); //이름 문자열 읽기
		System.out.print("반지름을 입력하세요 : ");
		int radius = scanner.nextInt(); //반지름 읽기
		circle.name = name;
		circle.radius = radius;
		double Circumference = circle.getCircumference();
		double area = circle.getArea();
		System.out.println(circle.name + "의 둘레는 " + Circumference);
		System.out.println(circle.name + "의 면적은 " + area);
		
		//두 번째 원 
		Circle circle2 = new Circle();
		System.out.print("원의 이름을 입력하세요 : ");
		String name2 = scanner.next(); 
		System.out.print("반지름을 입력하세요 : ");
		int radius2 = scanner.nextInt();
		circle2.name = name2;
		circle2.radius = radius2;
		double Circumference2 = circle2.getCircumference();
		double area2 = circle2.getArea();
		System.out.println(circle2.name + "의 둘레는 " + Circumference2);
		System.out.println(circle2.name + "의 면적은 " + area2);
		
		scanner.close();
	}

}
