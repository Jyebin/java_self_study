//
//  7.c
//  1
//
//  Created by 조예빈 on 2022/05/06.
//

#include <stdio.h>
int main()
{
    int i,j,k,num=0;
    printf("점수를 입력하세요: ");
    scanf("%d %d %d",&i,&j,&k);
    num = (i + j + k) / 3;
    if(num==100){
        printf("A");
    }
    switch (num/10){
        case 9:
            printf("A");
            break;
        case 8:
            printf("B");
            break;
        case 7:
            printf("C");
            break;
        case 5:
            printf("D");
            break;
        default:
            printf("F");
            break;
    }
        
}
