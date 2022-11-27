//
//  12.c
//  1
//
//  Created by 조예빈 on 2022/05/09.
//

#include <stdio.h>

int A(int n)
{
    if(n==0){
        return 1;
    }
    if(n==1){
        return 2;
    }
    else{
        return (2 * A(n-1));
    }
}
int main()
{
    int i;
    printf("정수입력: \n");
    scanf("%d",&i);
    printf("%d",A(i));
}
