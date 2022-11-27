//
//  11.c
//  1
//
//  Created by 조예빈 on 2022/05/09.
//

#include <stdio.h>

int A(int i, int j, int k);
int B(int i, int j, int k);

int main()
{
    int i,j,k;
    scanf("%d %d %d",&i,&j,&k);
    printf("가장 큰 수 : %d\n",A(i,j,k));
    printf("가장 작은 수 : %d\n",B(i,j,k));
    
    return 0;
}
int A(int i, int j, int k)
{
    if(i>j && i>k){
        return i;
    }
    else if(j>i && j>k){
        return j;
    }
    else{
        return k;
    }
}
int B(int i, int j, int k)
{
    if(i<j && i<k){
        return i;
    }
    else if(j<i && j<k){
        return j;
    }
    else{
        return k;
    }
}
