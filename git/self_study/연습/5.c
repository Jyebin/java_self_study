//
//  5.c
//  1
//
//  Created by 조예빈 on 2022/05/06.
//

#include <stdio.h>
int main()
{
    int num=0;
    while(1){
        printf("1.홀수 짝수 확인\n2.N까지의 합계 구하기\n3.N팩토리얼 구하기(N!)\n");
        printf("선택: ");
        scanf("%d",&num);
        if(num==0){
            break;
        }
        else if(num==1){
            int i;
            printf("숫자를 입력하세요: ");
            scanf("%d",&i);
            if(i%2==0){
                printf("%d는 짝수입니다.\n",i);
            }
            else
                printf("%d는 홀수입니다.\n",i);
        }
        else if(num==2){
            int i,j,count = 0;
            printf("정수를 입력하세요: ");
            scanf("%d",&j);
            for(i=1;i<=j;i++){
                count = count + i;
            }
            printf("1~%d까지의 합계는 %d입니다.\n",j,count);
            
        }
        else if(num==3){
            int i,j,num = 1;
            printf("정수를 입력하세요: ");
            scanf("%d",&j);
            for(i=1;i<=j;i++){
                num = num * i;
            }
            printf("%d!는 %d입니다.\n",j,num);
        }else{
            printf("다시입력해주세요\n");
        }
    }
}
