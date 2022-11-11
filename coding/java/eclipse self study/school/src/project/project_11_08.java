package project;
import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;

public class project_11_08 {
	public static void main(String[] args) {
		Vector<Goods> goodsVector = new Vector<Goods>(3); //Goods Vector 선언 -> 초기 용량은 3으로
        Scanner s = new Scanner(System.in); //스캐너
        for (int i = 0; i < goodsVector.capacity(); i++) { //goodsvector의 용량 만큼 반복문
            String name = s.next();
            int price = s.nextInt();
            int n = s.nextInt();
            int sold = s.nextInt();
            goodsVector.add(new Goods(name, price, n, sold)); //벡터에 새로운 굿즈 클래스를 선언하며 값 넣어주기
        }
        for (int i = 0; i < goodsVector.size(); i++) { //벡터에 값 들어가있는 만큼 반복문
            System.out.print(goodsVector.get(i).getName() + " "); //출력
            System.out.print(goodsVector.get(i).getPrice() + " ");
            System.out.print(goodsVector.get(i).getNumberOfStock() + " ");
            System.out.println(goodsVector.get(i).getSold());
        }
    }
}

class Goods{
	private String name;
	private int numberOfStock;
	private int sold;
	private int price;

	Goods(String name, int price, int numberOfStock, int sold){
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	String getName() {return name;}
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
}