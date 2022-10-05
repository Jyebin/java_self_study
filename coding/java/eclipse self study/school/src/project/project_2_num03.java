package project;

class Song{
	private String title,artist,country;
	private int year;
	
	Song(String title, String artist, int year, String country){
		this.title = title; //title 초기화
		this.artist = artist; //artist 초기화
		this.year = year; //year 초기화
		this.country = country; //country 초기화
	}
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}
public class project_2_num03 {

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
		

	}

}
