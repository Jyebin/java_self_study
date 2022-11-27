//
//  16.c
//  1
//
//  Created by 조예빈 on 2022/05/10.
//

#include <stdio.h>
int main(){
    int i,j,tmp,num=0;
    scanf("%d %d",&i,&j);
    if(i<j){
        tmp = i;
        i = j;
        j = tmp;
    }
   
    while(1){
        num = i%j;
        if(num==0){
            printf("최대공약수=%d\n",j);
            
            break;
        }
        else{
            i = j;
            j = num;
        }
        
    }
    
    
}
