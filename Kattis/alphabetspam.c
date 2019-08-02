#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    
    char str[] = "Welcome_NWERC_participants!";
    // printf("%lu", strlen(str));
    float size = 1.0 / strlen(str);
    printf("%0.16f", size);

    return 0;
}