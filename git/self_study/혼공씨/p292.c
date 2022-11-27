//
//  p292.c
//  study
//
//  Created by 조예빈 on 2022/07/15.
//

#include <stdio.h>

void input_nums(int *lotto_nums); //배열에 로또 번호를 입력하는 함수
void print_nums(int *lotto_nums); //배열에 저장된 값을 출력하는 함수

int main(void)
{
    int lotto_nums[6]; //로또 번호를 저장할 배열
    
    input_nums(lotto_nums); //입력 함수 호출
    print_nums(lotto_nums); //출력 함수 호출
    return 0;
}

void input_nums(int *lotto_nums)
{
    int num;
    int dup;
    
    for(int i=0;i<6;i++){
        printf("번호 입력 :");
        scanf("%d",&num);
        dup = 0;
        for(int j=0;j<i;j++){
            if(num == lotto_nums[j]){
                dup = 1;
                break;
            }
        }
        if(!dup){
            lotto_nums[i] = num;
        }
        else{
            printf("같은 번호가 있습니다!\n");
            i--;
        }
    }
}

void print_nums(int *lotto_nums)
{
    printf("로또 번호: ");
    for(int i=0;i<6;i++){
        printf(" %d ",lotto_nums[i]);
    }
}
