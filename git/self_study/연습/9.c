//
//  9.c
//  1
//
//  Created by 조예빈 on 2022/05/09.
//

#include <stdio.h>
int main()
{
    int i,j,k;
    for(i=1;i<=9;i++){
        if(i%2==0){
            continue;
        }
        for(j=1;j<=i;j++){
            k = i * j;
            printf("%d x %d = %d\n",i,j,k);
            
            
        }
    }
}
