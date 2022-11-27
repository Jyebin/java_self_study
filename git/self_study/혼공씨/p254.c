//
//  p254.c
//  study
//
//  Created by 조예빈 on 2022/07/03.
//

#include <stdio.h>
void swap(int *pa, int *pb); //두 변수의 값을 바꾸는 함수 선언

int main()
{
    int a=10, b=20;
    swap(&a,&b);
    printf("a:%d, b:%d\n",a,b);
    
    return 0;
}

void swap(int *pa, int *pb)
{
    int temp; //교환을 위한 임시 매개변수
    
    temp = *pa; //temp에 pa가 가리키는 변수의 값 저장
    *pa = *pb; //pa가 가리키는 변수에 pb가 가리키는 변수의 값 저장
    *pb = temp; //pb가 가리키는 변수에 temp 저장
}
