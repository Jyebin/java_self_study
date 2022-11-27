//
//  4.c
//  1
//
//  Created by 조예빈 on 2022/05/04.
//

#include <stdio.h>
int main()
{
    int i,j,k,sum=0;
    printf("정수 두개를 입력하세요\n");
    scanf("%d %d",&i,&j);
    if(i<j){
    for(k=i;k<=j;k++){
        sum = sum + k;

    }
    }
    printf("%d\n",sum);
}
