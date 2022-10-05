package project;
import java.util.Scanner;

class Circle1{
	private double x,y;
	private int radius;
	public Circle1(double x, double y, int radius) {
		this.x = x; //x 초기화
		this.y = y; //y 초기화
		this.radius = radius; //radius 초기화
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
}
public class project_2_num05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle1 c [] = new Circle1[3]; //3개의 Circle 배열 선언
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble(); //x값 읽기 
			double y = scanner.nextDouble(); //y값 읽기
			int radius = scanner.nextInt(); //반지름 읽기
			c[i] = new Circle1(x, y, radius);
		}
		for(int i = 0; i < c.length; i++) c[i].show();
		scanner.close();
	}

}
