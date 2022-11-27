//
//  2.c
//  1
//
//  Created by 조예빈 on 2022/05/04.
//

#include <stdio.h>
int main()
{
    int i,j=0;
    while(1){
        scanf("%d",&i);
        if(i==0){
            break;
        }
        j = j + i;
    }
    printf("%d",j);
}
