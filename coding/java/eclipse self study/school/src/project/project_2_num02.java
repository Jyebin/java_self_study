package project;
import java.util.Scanner;
	
class Grade{
	private int math, science, english;
	Grade(int math, int science, int english){
		this.math = math; //math 초기화
		this.science = science; //science 초기화
		this.english = english; //english 초기화
	}
	public int average(){
		return ((math + science + english)/3); //평균을 구해서 return
	}
	
}

public class project_2_num02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		scanner.close();
	}
	

}
