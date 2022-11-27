//
//  18.c
//  1
//
//  Created by 조예빈 on 2022/05/21.
//

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
    int i,j=1,k=0;
    printf("ªÛºˆ n ¿‘∑¬: ");
    scanf("%d", &i);
    while (1) {
        if (j >= i) {
            break;
        }
        j *= 2;
        k++;
    }
    printf("%d", k);
    return 0;
}
