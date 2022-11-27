//
//  p204.c
//  study
//
//  Created by 조예빈 on 2022/07/02.
//

#include <stdio.h>
void sum(int n); //sum함수 선언
int main(void)
{
    sum(10); //함수 sum에 10 대입
    sum(100); //함수 sum에 100 대입
    return 0;
}
void sum(int n) //sum함수 정의
{
    int i, tot = 0;
    for(i=1;i<=n;i++){
        tot += i; //tot값이 0으로 시작. 0부터 i번까지 합쳐줌.
    }
    printf("1부터 %d까지의 합은 %d입니다.\n",n,tot);
}
