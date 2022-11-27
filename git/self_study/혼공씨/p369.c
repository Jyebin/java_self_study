//
//  p369.c
//  study
//
//  Created by 조예빈 on 2022/08/02.
//

#include <stdio.h>

void func(void);

int a = 10;

int main(void)
{
    a = 20;
    func();
    printf("%d",a);
    return 0;
}

void func(void)
{
    a = 30;
}
