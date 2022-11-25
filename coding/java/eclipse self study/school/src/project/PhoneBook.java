package project;
import java.util.*;

class Phone {
String name, loc, tel;

public Phone(String name, String loc, String tel) {
this.name = name;
this.loc = loc;
this.tel = tel;
}
}


public class PhoneBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("-----------------------------------------");
		System.out.println("전화번호 관리 프로그램을 시작합니다.");
		System.out.println("-----------------------------------------");

		HashMap<String, Phone> phone = new HashMap<String, Phone>();
		String name, loc, tel;

		while(true) {
		System.out.print("삽입 : 0  삭제 : 1  찾기 : 2  전체보기 : 3  종료 : 4  >>> ");
		int sel = s.nextInt();

		if(sel == 0) {
		System.out.print("이름 >> ");
		name = s.next();
		System.out.print("주소 >> ");
		loc = s.next();
		System.out.print("전화번호 >> ");
		tel = s.next();
		Phone p = new Phone(name, loc, tel);

		phone.put(name, p);
		System.out.println();
		}else if(sel == 1) {
		System.out.print("이름 >> ");
		name = s.next();

		Phone p = phone.get(name);
		if(p == null) {
		System.out.println(name + "은 등록되어 있지 않은 사람입니다.");
		System.out.println();
		}else {
		phone.remove(name);
		System.out.println(p.name + "은 삭제되었습니다.");
		System.out.println();
		}
		}else if(sel == 2) {
		System.out.print("이름 >> ");
		name = s.next();

		Phone p = phone.get(name);
		if(p == null) {
		System.out.println(name + "은 등록되어 있지 않은 사람입니다.");
		System.out.println();
		}else {
		System.out.println(p.name + " " + p.loc + " " + p.tel);
		System.out.println();
		}
		}else if(sel == 3) {
		Set<String> keys = phone.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
		String key = it.next();
		Phone p = phone.get(key);
		System.out.println(p.name + " " + p.loc + " " + p.tel);
		}
		System.out.println();
		}else if(sel == 4) {
		System.out.println("프로그램을 종료합니다...");
		break;
		}else {
		System.out.println("잘못된 입력입니다.");
		System.out.println();
		}
		}

	}

}
