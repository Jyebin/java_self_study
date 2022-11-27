//
//  p206.c
//  study
//
//  Created by 조예빈 on 2022/07/02.
//

#include <stdio.h>
int rec_func(int n); //main함수 밖에 함수 선언, 호출하기 전에 선언

int main()
{
    int i;
    printf("숫자를 입력하시오 : ");
    scanf("%d",&i);
    printf("결과 : %d\n", rec_func(i));
    
    return 0;
}

int rec_func(int n) //함수 정의
{
    if(n==1){ //n이 1이면 1을 반환
        return 1;
    }
    else{
        return (n + rec_func(n-1)); //n이 1이 아닌 모든 경우에 n+rec_fnc(n-1)을 반환. n이 10일 경우에 10 + 9 + 8 + ... + 2 + 1까지 더해지고, 1일경우에는 1이 반환되도록 하여 함수가 끝나도록 함.
    }
}
