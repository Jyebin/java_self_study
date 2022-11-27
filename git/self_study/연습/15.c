//
//  15.c
//  1
//
//  Created by 조예빈 on 2022/05/10.
//

#include <stdio.h>

int fibo(int i){
    if(i==0){
        return 0;
    }else if(i==1){
        return 1;
    }
    else{
        return fibo(i-1)+fibo(i-2);
    }
    
}

int main(){
    int i;
    scanf("%d",&i);
    for(int k=0;k<i;k++){
        printf("%d",fibo(k));
    }
}
