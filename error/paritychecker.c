#include <stdio.h>
int main() {
    char byte[10], ch;
    printf("Enter the 8-bit Data:");
    scanf("%s", byte);
    printf("Enter 'e' for Even parity\n");
    printf("Enter 'o' for Odd parity\n");
    scanf(" %c", &ch);
    int count = 0;
    for (int i = 0; i < 8; i++)
        if (byte[i] == '1')
            count++;

    if (ch == 'e') {
        if (count % 2 == 0)
            printf("No error ");
        else {
            printf("There is an error \n");
            byte[8] = '1';
            printf("After error correction: %s", byte);
        }
    }
    else if (ch == 'o') {
        if (count % 2 == 1)
            printf("No error");
        else {
            printf("There is an error\n");
            byte[8] = '1';
            printf("After error correction : %s", byte);
        }
    }
    else
        printf("Invalid Choice");

    return 0;
}