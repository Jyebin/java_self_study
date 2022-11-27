//
//  p326.c
//  study
//
//  Created by 조예빈 on 2022/07/21.
//

#include <stdio.h>
int main(void)
{
    char str[80];
    printf("공백이 포함된 문자열 입력 : ");
    fgets(str, sizeof(str),stdin);
    printf("입력한 문자열은 %s 입니다\n",str);
    
    return 0;
}
