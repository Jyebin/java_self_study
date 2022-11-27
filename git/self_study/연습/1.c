//
//  1.c
//  1
//
//  Created by 조예빈 on 2022/05/16.
//

void print_array(void)
{
  int i; //정수형 변수 i 선언

  printf("("); // ( 출력
  for (i = 0; i <= current; i++) //i가 0일때부터 current보다 작거나 같을 때까지 1씩 증가시키는 for문
    printf("%d%s", array[i], i == current ? "" : ","); //i가 current와 같으면 array[]을, 아니면 array[,]를 출력
  printf(")\n"); //)\n 출력
}



int add_array(int item)
{
  if (current == ARRAY_SIZE - 1) //만약 current가 배열의 크기-1과 같다면
    return -1; //-1로 return해줌

  current = current + 1; //current =+ 1;이라고 써도돼! current값을 1씩 증가시켜주는 식
  array[current] = item; //array[current]에 item을 넣어줌

  return item; //item을 return해줌
}





int main(void)
{
  int i; //정수형 변수 i선언. print_array에서 사용된 변수와 다른 변수임

  for (i = 0; i < ARRAY_SIZE + 1; i++) { //i가 0부터 ARRAY_SIZE + 1일 때까지 1씩 증가
    printf("add_array(%d)=%d: ", i, add_array(i)); //add array( )의 괄호 안에 i 값을, = 뒤에 add_array(i)값을 출력
    print_array(); //위에서 선언한 함수 호출
  }
  for (i = 0; i < ARRAY_SIZE + 1; i++) {
    printf("delete_array()=%d: ", delete_array());
    print_array();
  }
