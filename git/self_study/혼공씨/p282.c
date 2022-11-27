//
//  p282.c
//  study
//
//  Created by 조예빈 on 2022/07/05.
//

#include <stdio.h>

void print_ary(int *pa); //함수 선언

int main(void)
{
    int ary[5] = {10, 20, 30, 40, 50};
    
    print_ary(ary); //배열명을 주고 함수 호출. int형 변수의 주소가 함수에 전달
    
    return 0;
}

void print_ary(int *pa) //매개변수로 int형을 가리키는 포인터 pa 선언
{
    int i;
    for(i=0;i<5;i++){
        printf("%d ",pa[i]); //pa로 배열 요소 표현식 사용
    }
}
