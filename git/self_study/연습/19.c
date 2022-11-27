//
//  19.c
//  1
//
//  Created by 조예빈 on 2022/05/21.
//

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main() {
    int i, max = 0, min, sum = 0;
    int arr[5];
    for (i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }
    min = arr[0];
    for (i = 0; i < 5; i++) {
        if (max < arr[i]) {
            max = arr[i];
        }
        if (min > arr[i]) {
            min = arr[i];
        }
        sum += arr[i];
    }
    printf("√÷¥Î:%d √÷º“:%d √—«’:%d", max, min, sum);
}

