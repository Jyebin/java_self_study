//
//  p370.c
//  study
//
//  Created by 조예빈 on 2022/08/02.
//

#include <stdio.h>

int func(void);

int main(void)
{
    int i, sum = 0;
    
    for(i=0;i<10;i++){
        sum += func();
    }
    printf("%d",sum);
    return 0;
}

int func(void)
{
    static int a = 0;
    a++;
    return a;
}
