package book;

public class ForeachExample {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int sum = 0;
		for(int k:num)//반복될 때마다 k는 num[0], num[1], ... num[4] 값으로 설정
			sum += k;
		System.out.println("합은 " + sum);

	}

}
