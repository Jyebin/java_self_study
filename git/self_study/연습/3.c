//
//  3.c
//  1
//
//  Created by 조예빈 on 2022/05/04.
//

#include <stdio.h>
int main()
{
    int i=0,sum=0;
    do{
        sum+=i;
        i+=2;
    }while(i<101);
    printf("%d\n",sum);
}
