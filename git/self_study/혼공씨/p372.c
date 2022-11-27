//
//  p372.c
//  study
//
//  Created by 조예빈 on 2022/08/02.
//

#include <stdio.h>

int add_ten(int a); //함수 선언

int main(void)
{
    int a = 10;
    
    a = add_ten(a); //a 값을 복사하여 전달
    printf("a : %d\n",a);
    
    return 0;
}

int add_ten(int a)
{
    a = a + 10;
    return a;
}
