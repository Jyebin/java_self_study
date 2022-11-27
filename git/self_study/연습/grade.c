//
//  grade.c
//  1
//
//  Created by 조예빈 on 2022/05/02.
//

#include <stdio.h>
int main(void)
{
   int a;
   printf("점수를 입력하세요\n");
   scanf("%d",&a);
   if(a>=90)
      printf("A\n");
   else if(a>=80)
      printf("B\n");
   else if(a>=70)
        printf("C\n");
   else
      printf("F\n");
    return 0;
}
