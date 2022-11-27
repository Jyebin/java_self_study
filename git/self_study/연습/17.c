//
//  17.c
//  1
//
//  Created by 조예빈 on 2022/05/16.
//

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
    int i, hour, min, sec;
    printf("초를 입력하세요: ");
    scanf("%d", &i);
    hour = i / 3600;
    min = (i - hour * 3600) / 60;
    sec = (i - hour * 3600) % 60;

    printf("h:%d, m:%d, s:%d", hour, min, sec);

    
}
