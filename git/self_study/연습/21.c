//
//  21.c
//  1
//
//  Created by 조예빈 on 2022/05/25.
//



#include <stdio.h>
int main(){
    int a,b;
    scanf("%d",&a);
    scanf("%d",&b);
    printf("%d\n",a*(b%380));
    printf("%d\n",a*((b%300-b%380))/10);
    printf("%d\n",a*((b-b%300))/100);
    printf("%d\n",a*b);

    
    return 0;
    
}

//2588번
