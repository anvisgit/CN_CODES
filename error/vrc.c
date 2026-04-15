#include <stdio.h>
int main() {
    int n, m; 
    scanf("%d", &n);
    scanf("%d", &m);
    char f[n][m];
    int i, j, c = 0, count;


    for (i = 0; i < n; i++) {
        printf("Frame%d: ", i + 1);
        scanf("%s", f[i]);
    }

    for (i = 0; i < n; i++) {
        count = 0;
        for (j = 0; j < m; j++)
            if (f[i][j] == '1')
                count++;

        if (count % 2 != 0) {
            printf("There is an error %d\n", i + 1);
            c = 1;
        }
    }

    if (c == 0)
        printf("No errors ");

    return 0;
}