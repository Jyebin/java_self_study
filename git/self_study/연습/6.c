//
//  6.c
//  1
//
//  Created by 조예빈 on 2022/05/06.
//

#include <stdio.h>

int main(){
    int i, j, num=0;
    printf("두개의 정수를 입력하시오: ");
    scanf("%d %d",&i,&j);
    num = ((i>j)?(i-j):(j-i));
    printf("%d\n", num);
    
}
