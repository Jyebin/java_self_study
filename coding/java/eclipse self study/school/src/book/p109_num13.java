package book;

public class p109_num13 {

	public static void main(String[] args) {
		int sum = 0;
		char grade = 'A';
		switch(grade) {
		case 'A' : sum += 100;
		case 'B' : sum += 50;
		case 'C' : sum += 30;
		case 'D' : sum += 10;
		}
		
		System.out.print(sum);
	}

}
