#include <stdio.h>
#include <stdlib.h>

int main(){
    int n;
    scanf("%d", &n);

    int i;
    for(i = 0; i < n; i++){
        int f;
        int total = 1;
        scanf("%d", &f);
        if(f == 0 && f == 1){
            printf("%d\n", 1);
        } else {
            for(int i = 2; i <= f; i++){
                total *= i;
            }
            printf("%d\n" , total%10);
        }
    }

    return 0;
}