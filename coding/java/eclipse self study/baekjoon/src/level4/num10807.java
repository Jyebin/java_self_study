package level4;
import java.util.Scanner;
public class num10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i]= sc.nextInt(); //N개의 수를 공백으로 나눠서 입력받음
		}
		int v = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == v) {
				cnt = cnt + 1;
			}
		}
		System.out.print(cnt);
		sc.close();
		}
}