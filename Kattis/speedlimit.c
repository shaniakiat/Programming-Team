#include <stdio.h>
#include <stdlib.h>

int main(){
    int n;
    scanf("%d", &n);
    while( n != -1){
        int total = 0;
        int diff;
        for(int i = 0; i < n; i++){
            int speed;
            int time;
            
            scanf("%d", &speed);
            if( i == 0){
                scanf("%d", &time);
                diff = time;
            } else {
                scanf("%d", &time);
                diff = time - diff;
            }
            
            total += (speed * diff);
            diff = time;
            
        }
        printf("%d miles\n", total);
        scanf("%d", &n);
    }
    return 0;
}