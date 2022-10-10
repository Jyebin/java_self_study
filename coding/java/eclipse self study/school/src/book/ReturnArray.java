package book;

public class ReturnArray {
	
	static int[] makeArray() { //정수형 배열을 리턴하는 메소드
		int temp[] = new int[4]; //배열 생성
		for(int i=0; i<temp.length; i++) {
			temp[i] = i+1; //배열의 원소를 1,2,3,4로 초기화
		}
		return temp; //배열 리턴
	}

	public static void main(String[] args) {
		int intArray[]; //배열 리퍼런스 변수 선언
		intArray = makeArray(); //메소드로부터 배열을 전달받음
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " "); //배열의 모든 원소 출력
		}

	}

}
