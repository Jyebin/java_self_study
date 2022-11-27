//
//  p286.c
//  study
//
//  Created by 조예빈 on 2022/07/07.
//

#include <stdio.h>

void input_ary(double *pa, int size);
double find_max(double *pa, int size);

int main(void)
{
    double ary[5];
    double max; //최댓값을 저장할 변수
    int size = sizeof(ary) / sizeof(ary[0]); //배열 요소의 개수 계산
    
    input_ary(ary, size); //배열에 값을 입력하는 함수
    max = find_max(ary, size); //배열의 최댓값을 반환하는 함수
    printf("배열의 최댓값 : %.1lf\n", max);
    
    return 0;
}

void input_ary(double *pa, int size) //double 포인터를 매개변수로 선언
{
    int i;
    
    printf("%d개의 실수값 입력 : ", size);
    for(i=0;i<size;i++){ //size의 값에 따라 반복 횟수 결정
        scanf("%lf", pa+i); //&pa[i]도 가능함. 입력할 배열 요소의 주소를 전달
    }
}

double find_max(double *pa, int size)
{
    double max;
    int i;
    
    max = pa[0]; //첫 번째 배열 요소의 값을 최대값으로 설정
    for(i=0;i<size;i++){ //두 번째 배열 요소부터 max와 비교
        if(pa[i] > max) max = pa[i]; //새로운 배열 요소의 값이 max보다 크면 max에 새로운 값 대입
    }
    return max; //최댓값 반환
}
