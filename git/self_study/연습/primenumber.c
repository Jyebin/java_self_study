//
//  primenumber.c
//  1
//
//  Created by 조예빈 on 2022/05/02.
//

#include <stdio.h>
int main()
{
    int i,j,k;
    int count = 0;
    int count1 = 0;
    printf("2이상의 정수를 입력하시오 : \n");
    scanf("%d",&i);


    for(j=2; j<=i; j++){
        for(k=1; k<=j; k++){
            if(j % k == 0){
                count1+=1;
            }
        }
        if(count1 == 2){
            printf("%5d ",j);
            count++;
            if(count % 5 == 0){
                printf("\n");
            }
        }
        count1 = 0;
    }
}
