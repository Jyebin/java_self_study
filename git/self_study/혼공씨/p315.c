//
//  p315.c
//  study
//
//  Created by 조예빈 on 2022/07/22.
//

#include <stdio.h>
int main()
{
    int ch;
    int len, max = 0;
    
    while(1){ //while문 계속 반복
        len = 0; //len값을 0으로 선언
        ch = getchar(); //키보드에서 버퍼로 입력받음
        while((ch != -1)&&(ch != '\n')){ //ch가 -1이거나 \n이 아닐 때(키보드로 입력받아 종료하지 않거나 버퍼가 비어있지 않을 때)
            len ++; //len값 증가
            ch = getchar(); //버퍼 초기화
        }
        if(ch==-1){ //ch가 -1이면 break
            break;
        }
        if(len>max){ //len이 max보다 길면 최대값을 len으로 지정
            max = len;
        }
    }
    printf("가장 긴 단어의 길이 : %d\n",max);
    
    return 0;
    
}
