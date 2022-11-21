package level4;
import java.util.Scanner;

public class num5597 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		int [] arr = new int[31];
		
		for(int i=1; i<31; i++) {
			arr[i] = 0; //1부터 30까지의 숫자가 담긴 배열 numarr생성
		}
		for(int i=1;i<29;i++) { //제출한 학생의 학번 수를 입력받는 함수
			int n = sc.nextInt();
			arr[n] = 1;
		}
		
		for(int i=1; i<31; i++) { //제출한 학생의 학번 수와 원래의 학번(30개)를 비교
				if(arr[i] != 1) {
					System.out.println(i);
				}
		sc.close();
		}
	}
}
