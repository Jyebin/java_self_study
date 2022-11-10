package project;
import java.util.Scanner;
import java.util.Vector;
public class ex {
	public static void main(String[] args) {
		Goods [] goodsArray;
		goodsArray = new Goods [3];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<goodsArray.length; i++) {
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold);
		}
		for(int i=0;i<goodsArray.length; i++) {
			System.out.print(goodsArray[i].getName()+" ");
			System.out.print(goodsArray[i].getPrice()+" ");
			System.out.print(goodsArray[i].getNumberOfStock() + " ");
			System.out.println(goodsArray[i].getSold());
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
	int getSold() {
		return sold;
		}
	}