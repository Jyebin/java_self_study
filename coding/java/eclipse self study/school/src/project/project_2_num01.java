package project;

	class TV{
		private String company;
		private int year,inch;
		TV(String i, int j, int k){
			company = i; 
			year = j;
			inch = k;
		}
		public void show() {
			System.out.println(company + "에서 만든" + year + "년" + inch + "인치");
		}
	}
	
public class project_2_num01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
	}

}
