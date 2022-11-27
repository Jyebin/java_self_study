//
//  p353(2).c
//  study
//
//  Created by 조예빈 on 2022/08/02.
//

#include <stdio.h>
#include <string.h>

int main()
{
    char str1[80];
    char str2[80];
    char str3[80];
    
    printf("세 단어 입력:");
    scanf("%s %s %s", str1, str2, str3);
    
    if(strcmp(str1,str2) > 0){ //str1이 str2보다 크면(사전에 나중에 나오면)
        if(strcmp(str2,str3)>0){ //str2가 str3보다 크면(사전에 나중에 나오면)
            printf("%s, %s, %s",str3,str2,str1);
        }else{
            printf("%s, %s, %s",str2,str3,str1);
        }
    }else{
        if(strcmp(str1,str3)>0){ //str1이 str3보다 사전에 나중에 나오면
            printf("%s, %s, %s",str1,str3,str2);
        }else{
            printf("%s, %s, %s",str3,str1,str2);
        }
    }
}
