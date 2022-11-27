//
//  14.c
//  1
//
//  Created by 조예빈 on 2022/05/10.
//

#include <stdio.h>

int J(float i){
    return (int) i;
}

float S(float i){
    i = i - (int) i;
    return i;
}

int main(){
    float i;
    scanf("%f",&i);
    printf("정수 : %d\n",J(i));
    printf("소수 : %f",S(i));
}
