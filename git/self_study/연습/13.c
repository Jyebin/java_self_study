//
//  13.c
//  1
//
//  Created by 조예빈 on 2022/05/09.
//

#include <stdio.h>

int IsDigit(char i){
    if(i<='9' && i>='0'){
        return 1;
    }
    else{
        return 0;
    }
}

int main()
{
    int i;
    scanf("%c",&i);
    printf("%d",IsDigit(i));
}
