///Users/joyebin/coding/1/baekjoon/1008.c
//  p307.c
//  study
//
//  Created by 조예빈 on 2022/07/12.
//

#include <stdio.h>
int main(void)
{
    int res; //scanf 함수의 반환값을 저장할 변수
    char ch; //문자를 입력할 변수
    
    while(1){
        res = scanf("%c",&ch); //문자 입력. ctrl+z를 누르면 -1 반환
        if(res == -1){ //반환값이 -1이면 반복 종료
            break;
        }
        printf("%d ",ch); //입력된 문자의 아스키 코드 값 출력
    }
    return 0;
}

