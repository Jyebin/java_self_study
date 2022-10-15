package book;



class Circle{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 2.14*radius*radius;
	}
}
public class CircleArray {

	public static void main(String[] args) {
		Circle [] c; //Circle 배열에 대한 레퍼런스 c 생성
		c = new Circle[5]; //5 개의 레퍼런스 배열 생성
		
		for(int i=0; i<c.length; i++) { //배열의 개수 만큼
			c[i] = new Circle(i); //5개의 레퍼런스 배열 생성
		}
		for(int i=0; i<c.length; i++) {
			System.out.print((int)(c[i].getArea()) + " ");
		}

	}

}
