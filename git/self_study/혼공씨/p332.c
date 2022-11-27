//
//  p332.c
//  study
//
//  Created by 조예빈 on 2022/07/22.
//

#include <stdio.h>
int main(void)
{
    int i = 0; //배열 요소 첨자 변수
    char str[20]; //문자열을 저장할 배열
    char ch; //입력한 문자를 받아둘 임시 변수
    
    do{ //do~while문. 실행 후 조건을 검사
        ch = getchar(); //문자 하나를 입력받음
        str[i] = ch; //배열에 저장
        i++; //첨자 증가
    }while(ch != '\n'); //입력한 문자가 개행이면 종료
    
    str[--i] = '\0'; //개행 문자가 입력된 위치에 널 문자 저장
    printf("%s",str);
    return 0;
}
