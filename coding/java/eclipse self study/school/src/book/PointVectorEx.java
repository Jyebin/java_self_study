package book;

import java.util.Vector;

class Pointone{
	private int x,y;
	public Pointone(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
public class PointVectorEx {
	public static void main(String[] args) {
		Vector <Pointone> v = new Vector <Pointone>(); //Point객체를 요소로 다루는 벡터 생성
		//3개의 Point 객체 삽입
		v.add(new Pointone(2,3));
		v.add(new Pointone(-5,20));
		v.add(new Pointone(30,8));
		
		v.remove(1); //인덱스 1의 Point(-5,20)삭제
		
		for(int i=0; i<v.size(); i++) {
			Pointone p = v.get(i); //벡터의 i번째 Point 객체 얻어내기
			System.out.println(p); //p.toString()을 이용하여 객체 p 출력
		}
	}
}
