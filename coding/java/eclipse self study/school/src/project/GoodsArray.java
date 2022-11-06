package project;
import java.util.Scanner;
class Store{
	Scanner sc = new Scanner(System.in);
	
	Store[] goods;
	private String name;
	private int price;
	private int stock;
	private int sold;
	private int count;
	
	Store(){}
	
	Store(String name, int price, int stock){
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	void setSold() {
		for(int i=0; i<goods.length; i++) {
			goods[i].sold = 0;
		}
	}
	void setCount() {
		for(int i=0; i<goods.length; i++) {
			goods[i].count = 0;
		}
	}
	void setGoods() {
		System.out.print("슈퍼에서 취급하는 상품의 개수를 입력하시오.>>> ");
		int num = sc.nextInt();
		goods = new Store[num];
		
		for(int i=0; i<goods.length; i++) {
			System.out.print((i+1)+"번째 상품의 이름, 가격, 재고량을 입력하시오.>>> ");
			String name = sc.next();
			int price = sc.nextInt();
			int stock = sc.nextInt();
			goods[i] = new Store(name, price, stock);
		}
		System.out.println();
	}
	
int totalGoods() {
	int total = 0;
	for(int i=0; i<goods.length;i++) {
		total = total + (goods[i].price * goods[i].sold);
	}
	return total;
}
void Pay() {
	while(true) {
		System.out.println("판매 가격 총액 :" + totalGoods() + "원");
		System.out.print("받은 금액을 입력하시오.>>> ");
		int input = sc.nextInt();
		if(input < totalGoods()) {
			System.out.println("돈이 부족합니다.");
		}else {
			System.out.println();
			System.out.println("###  영수증  ###");
			System.out.println("==========================");
			for(int i=0; i<goods.length;i++) {
				if(goods[i].sold == 0) {
					System.out.println();
				}else {
					System.out.println(goods[i].name + "       "+goods[i].price + "X" + goods[i].sold + "       " + (goods[i].price * goods[i].sold));   
				}
			}
		}
		System.out.println("==========================");
		System.out.println("총액        "+totalGoods());
		System.out.println("받은금액     "+input);
		System.out.println("==========================");
		System.out.println("거스름돈     " + (input-totalGoods()));
		System.out.println();
		break;
	}
}
void sellGoods() {
	setSold();
	while(true) {
		for(int i=0; i<goods.length; i++) {
			System.out.print((i+1)+") "+goods[i].name+"   ");
		}
		System.out.println((goods.length + 1) + ") 계산");
		System.out.print(">>> ");
		int sel = sc.nextInt();
		
		for(int i=0; i<goods.length; i++) {
			if(sel == (i+1)) {
				goods[i].sold++;
				goods[i].stock--;
			}else if(sel == (goods.length + 1)) {
				System.out.println();
				Pay();
				break;
			}
		}
		if(sel == (goods.length + 1)) {
			break;
		}
	}

}

void purchaseGoods() {
	setCount();
	while(true) {
		for(int i=0; i<goods.length; i++) {
			System.out.print((i+1)+") "+goods[i].name+"     ");
			System.out.println((goods.length + 1) + ") 구매 종료");
			System.out.print(">>> ");
			int sel = sc.nextInt();
			
			for(int j=0; j<goods.length; j++) {
				if(sel == (j+1)) {
					System.out.print("구매 수량을 입력하시오. >>>");
					goods[j].count = sc.nextInt();
					goods[j].stock = goods[j].stock + goods[i].count;
					System.out.println(" ## " + goods[j].name + "의 재고량이 " + goods[j].stock + "으로 증가함.");
					System.out.println();
				}else if(sel == (goods.length + 1)) {
					System.out.println();
					break;
				}
			}
			if(sel == (goods.length + 1)) {
				break;
			}
		}
	}
}
void showGoods() {
	System.out.println("### 상품명 재고량 ###");
	System.out.println("==========================");
	for(int i=0; i<goods.length; i++) {
		System.out.println(goods[i].name + "   " + goods[i].stock);
	}
	System.out.println("==========================");
	System.out.println();
}

void runStore() {
	setGoods();
	while(true) {
		System.out.println("1) 판매   2)구매   3)조회   4)종료");
		System.out.print(">>> ");
		int opt = sc.nextInt();
		System.out.println();
		if(opt == 1) {
			sellGoods();
		}else if(opt == 2) {
			purchaseGoods();
		}else if(opt == 3) {
			showGoods();
		}else if(opt == 4) {
			System.out.println("종료합니다.");
			break;
		}else {
			System.out.println("잘못된 입력입니다.");
			System.out.println();
		}
	}
}
}

public class GoodsArray {
	public static void main(String[] args) {
		Store store = new Store();
		store.runStore();
		

	}
}

