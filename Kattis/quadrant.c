#include <stdio.h>
#include <stdlib.h>

int main(){
    int x;
    int y;
    scanf("%d", &x);
    scanf("%d", &y);

    if(x > 0 && y > 0 ){
        printf("%d", 1);
    } else if( x > 0 && y < 0){
        printf("%d", 4);
    } else if( x < 0 && y < 0){
        printf("%d", 3);
    } else {
        printf("%d", 2);
    }
    return 0;
}