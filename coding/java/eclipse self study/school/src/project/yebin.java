//import java.util.Scanner;
//
//public class SeventhHomework {
//   public static void main(String[] args) {
//      int GameMember;
//      String[] MemberName;
//      
//      Scanner sc = new Scanner(System.in);
//      
//      System.out.print("게임 참가자의 수를 입력하시오(최소 2명, 최대6명) : ");
//      
//      GameMember = sc.nextInt();
//      
//      MemberName = new String[GameMember];
//      
//      for(int i = 0; i < MemberName.length; i++) {
//         System.out.println("참가자의 이름을 입력하시오 : ");
//         
//         MemberName[i] = sc.next();
//      }
//      
//      for(int i=0; i<MemberName.length; i++) {
//         System.out.println(MemberName[i]);
//      }
//      
//      System.out.println("*** 지금부터 게임을 시작합니다. ***");
//      
//      char ch = 'y';
//      int count = 0;
//      String roundWinner;
//      int[] Array2 = new int[6];//라운드 승자 카운트를 위한 배열//
//      int start =0;
//      
//      do {
//         
//         int[] Array = {0, 0, 0, 0, 0, 0};//각 라운드 참가자별 점수를 위한 배열, 각 라운드에 들어가기 전 초기화//
//         
//         
//         roundWinner = "";
//         
//         Dice dice1 = new Dice();
//         Dice dice2 = new Dice();
//         
//         System.out.println("게임을시작하시려먼 숫자 1을 입력하시오(게임을 하고싶지 않을 경우 다른 수자를 입력해 주십시오) : ");
//         start = sc.nextInt();
//         
//         if(start == 1) {
//            count ++;
//            
//            for (int i = 0; i<MemberName.length; i++) {
//               
//               int a = dice1.roll();
//               int b = dice2.roll();
//               
//               Array[i] = a + b;
//               
//               System.out.println(MemberName[i] + " : 첫번째 주사위 = " + a + " 두번째 주사위  = " + b  + " 두 주사위의 합은 " + Array[i]);
//            }
//         }
//         
//         
//         if (Array[0] >= Array[1] && Array[0] >= Array[2] && Array[0] >= Array[3] && Array[0] >= Array[4] && Array[0] >= Array[5]) {
//            roundWinner = MemberName[0];
//         }
//         
//         else if (Array[1] >= Array[0] && Array[1] >= Array[2] && Array[1] >= Array[3] && Array[1] >= Array[4] && Array[1] >= Array[5]) {
//            roundWinner = MemberName[1];
//         }
//         
//
//         else if (Array[2] >= Array[1] && Array[2] >= Array[0] && Array[2]>= Array[3] && Array[2] >= Array[4] && Array[2] >= Array[5]) {
//            roundWinner = MemberName[2];
//         }
//         
//
//         else if (Array[3] >= Array[1] && Array[3] >= Array[2] && Array[3]>= Array[0] && Array[3] >= Array[4] && Array[3] >= Array[5]) {
//            roundWinner = MemberName[3];
//         }
//         
//
//         else if (Array[4] >= Array[1] && Array[4] >= Array[2] && Array[4]>= Array[3] && Array[4] >= Array[0] && Array[4] >= Array[5]) {
//            roundWinner = MemberName[4];
//         }
//         
//
//         else if (Array[5] >= Array[1] && Array[5] >= Array[2] && Array[5]>= Array[3] && Array[5] >= Array[4] && Array[5] >= Array[0]) {
//            roundWinner = MemberName[5];
//         }
//   
//         if (start ==1){
//            System.out.println("이 라운드의 승자는(동점시 컴퓨터 맘대로 승자를 결정) : " + roundWinner);//중복값이 안나오게 하는 방법을 몰라서 이렇게 써놨습니다...//
//            
//            for(int i= 0; i < MemberName.length; i++) {
//               if (roundWinner == MemberName[i]) {
//                  Array2[i]++;
//               }
//               
//            }
//         }
//         
//         System.out.println("게임을 그만두시고싶으시면 알파벳 'y'를 입력해주십시오(계속 하고싶으시면 'y'외에 다른 알파벳을 하나 입력하시오) : ");
//         ch = sc.next().charAt(0);
//      } while (ch != 'y');
//      
//      System.out.println("전체  " + count + "게임 중");
//      for(int i =0; i < MemberName.length; i++) {
//         System.out.println(MemberName[i] + "의 승리 수는 " + Array2[i]);
//      }
//      
//      sc.close();
//   }
//}
//
//class Dice {
//   private final int MAX = 6;
//   private int faceValue;
//   
//   public Dice() {
//      faceValue = 1;
//   }
//   
//   public int roll() {
//      faceValue = (int) (Math.random() * MAX) +1;
//      
//      return faceValue;
//   }
//}