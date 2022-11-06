package project;
import java.util.Scanner;
public class DiceGame{
	public static void main(String[] args) {
		      
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		int GameMember = game.game_setting(sc);
		int score = 0;
		 
		Player[] player = new Player[GameMember];{
		for(int i = 0; i < GameMember; i++)
			player[i] = new Player(sc);
		}
		while(true) {
			String person = null;
			int winnerIdx = 0;
			int winner = Integer.MIN_VALUE;
			game.start_game();
			for(int i=0; i<GameMember; i++) {
				System.out.println(player[i].get_name() + " 차례입니다. 주사위를 던지려면 1을 입력하세요.");
				int one = sc.nextInt();
				if(one == 1) {
					player[i].dice.roll_dice();
					System.out.println(player[i].get_name() + ": " + "첫번째 주사위 " + player[i].dice.get_a() + "   " + "두 번째 주사위 " + player[i].dice.get_b() + "   " + "두 주사위의 합 : " + player[i].dice.get_sum());
					score = player[i].dice.get_sum();
				}
				if(score > winner) {
					winner = score;
					winnerIdx = i;
				}
			}
   player[winnerIdx].win();
			person = player[winnerIdx].get_name();
			System.out.println("이번 게임의 승자는 "+ person +"입니다.");
			System.out.println("게임을 계속 하시겠습니까?(y/n): ");
			String y_or_n = sc.next();
			if(y_or_n.equals("n")) {
				System.out.println("게임을 종료합니다.");
				System.out.println("전체 " + game.game_count + "게임 중");
				for(int i=0; i<GameMember; i++) {
					System.out.println(player[i].get_name() + player[i].win_stack + "승");
				}System.out.print("입니다.");
				
				break;
			}
		}sc.close();
	}
		

	static class Dice {
		private int faceValue;
		public int roll() {
			faceValue = (int) (Math.random() * 6) +1;
			return faceValue;
		}
	}
	static class Game{
		public int game_count = 0;
		public int game_setting(Scanner sc) {
			System.out.print("게임 참가자의 수를 입력하시오(최소 2명, 최대6명) : ");
			return sc.nextInt();
		}
		public void start_game() {
			System.out.println("*** 지금부터 게임을 시작합니다. ***");
			game_count++;
			System.out.println("game #" + this.game_count);
			}	
		}
	}
	class Player{
		public String name;
		public int win_stack=0;
		Dice dice = new Dice();
		public Player(Scanner sc) {
			System.out.println("참가자의 이름을 입력하시오 : ");
			this.name = sc.next();
		}
		public String get_name() {
			return this.name;
		}
		public void win() {
			this.win_stack++;
		}
	}
	class Dice{
		public int a;
		public int b;
		public int sum = 0;
		public void roll_dice() {
			this.sum = 0;
			this.a = (int)(Math.random() * 6) + 1;
			this.b = (int)(Math.random() * 6) + 1;
			this.sum = a+b;
			}
		public int get_a(){
			return this.a;
		}	
		public int get_b(){
			return this.b;
		}	
		public int get_sum(){
			return this.sum;
		}	
	}