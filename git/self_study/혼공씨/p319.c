//
//  p319.c
//  study
//
//  Created by 조예빈 on 2022/07/15.
//

#include <stdio.h>
int main(void)
{
    printf("apple이 저장된 시작 주소 값 : %p\n", "apple"); //주소 값 출력. 문자열이 저장된 곳의 위치 값 출력. 문자열 "apple"은 배열 형태로 따로 저장되고, printf함수의 인수로 첫 번째 문자의 주소 사용
    printf("두 번째 문자의 주소 값 : %p\n", "apple"+1); //주소 값 출력
    printf("첫 번째 문자 : %c\n", *"apple"); //간접 참조 연산
    printf("두 번째 문자 : %c\n", *("apple"+1)); //포인터 연산식
    printf("배열로 표현한 세 번째 문자 : %c\n", "apple"[2]); //배열 표현식
    
    return 0;
}
