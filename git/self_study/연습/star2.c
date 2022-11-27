//
//  star2.c
//  1
//
//  Created by 조예빈 on 2022/05/02.
//


#include <stdio.h>
int main()
{
    for(int i=0; i<5; i++)
    {
        for(int j=4; j>=i; j--){ //=int j=i; j<5;j++
            printf("*");
    }
    printf("\n");
}
}
