//
//  p366.c
//  study
//
//  Created by 조예빈 on 2022/08/02.
//

#include <stdio.h>
int main(void)
{
    register int i; //레지스터 변수
    auto int sum = 0; //suto 지역 변수
    
    for(i=1;i<=10000;i++){ //반복 과정에서 i를 계속 사용함
        sum += i; //i 값을 반복하여 누적
    }
    printf("%d\n",sum);
    
    return 0;
}
