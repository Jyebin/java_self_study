package project;
import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;

public class project_11_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> namev = new Vector<String>();
		Vector <Integer> pricev = new Vector<Integer>();
		Vector <Integer> nv = new Vector<Integer>();
		Vector <Integer> soldv = new Vector<Integer>();

		for(int i=0; i<namev.size(); i++) {
			String name = null;
			int price = 0;
			int n = 0;
			int sold = 0;
			name = sc.next();
			price = sc.nextInt();
			n = sc.nextInt();
			sold = sc.nextInt();
			namev.add(name);
			pricev.add(price);
			nv.add(n);
			soldv.add(sold);
		}
		for(int i=0;i<namev.size();i++) {
			System.out.print(namev.get(i) + " ");
			System.out.print(pricev.get(i)+ " ");
			System.out.print(nv.get(i) + " ");
			System.out.print(soldv.get(i));
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