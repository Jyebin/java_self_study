//
//  p328.c
//  study
//
//  Created by 조예빈 on 2022/07/22.
//

#include <stdio.h>
#include <string.h>
int main(void)
{
    char str[80];
    printf("공백이 포함된 문자열 입력 : ");
    fgets(str, sizeof(str),stdin);
    str[strlen(str) -1] = '\0';
    printf("입력한 문자열은 %s 입니다\n",str);
    
    return 0;
}
