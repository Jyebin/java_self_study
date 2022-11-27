//
//  8.c
//  1
//
//  Created by 조예빈 on 2022/05/09.
//

#include <stdio.h>
int main()
{
    int i;
    printf("0이상의 정수를 입력하세요: \n");
    scanf("%d",&i);
    
    switch(i/10){
        case 0:
            printf("0이상 10미만");
            break;
        case 1:
            printf("10이상 20미만");
            break;
        case 2:
            printf("20이상 30미만");
            break;
        default:
            break;
    }
        
}
