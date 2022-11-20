package level3;
import java.util.Scanner;


public class num25304 {

	public static void main(String[] args) {
		int c=0,d=0;
		Scanner sc = new Scanner(System.in);
		int all = sc.nextInt(); //영수증에 적힌 총 금액 X
		int object = sc.nextInt(); //영수증에 적힌 구매한 물건 종류의 수 N
		for(int i=0; i<object; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			c = a * b;
			d = d + c;
		}
		if(all == d) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		sc.close();
	}
	
}
