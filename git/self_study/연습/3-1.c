//
//  ㅇㅇㅇ.c
//  1
//
//  Created by 조예빈 on 2022/06/13.
//


int external static_i=100,static_j=200;
void fun1(void)
{
  printf("&static_i=%p\n", &static_i); //static_i의 메모리 주소 출력
  printf("&static_j=%p\n", &static_j);//static_j의 메모리 주소 출력
}
void fun2(void)
{
  int static_i=300, static_j=400;//static_i를 300, static_j를 400으로 초기화


  printf("&static_i=%p\n", &static_i);//static_i의 메모리 주소 출력
  printf("&static_j=%p\n", &static_j);//static_j의 메모리 주소 출력

}
void fun3(void)
{
   int *dynamic_p;//정수형 포인터 dynamic_p 선언
   dynamic_p=malloc(sizeof(100));//정수형 포인터 dynamic_p의 주소에 size가 100인 메모리 할당

   printf("dynamic_p=%p\n", dynamic_p);//포인터 dynamic_p 출력 -> dynamic_p가 가리키는 시작주소 출력
}

