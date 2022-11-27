//
//  10.c
//  1
//
//  Created by 조예빈 on 2022/05/09.
//

#include <stdio.h>
int main()
{
    int i,j,k;
    for(i=0;i<=9;i++){
        for(j=0;j<=9;j++){
            k = i + j;
            if(k == 9){
                printf("  %d %d\n+ %d %d\n-----\n  %d %d\n\n",i,j,j,i,k,k);
            }
        }
    }
}
