#include <stdio.h>

int main() {
    int a[100], b[100], c[200];  // make c large enough to hold both
    int i, j = 0, n1, n2, n;

    printf("Enter size of first array: ");
    scanf("%d", &n1);

    printf("Enter elements of first array:\n");
    for (i = 0; i < n1; i++)
        scanf("%d", &a[i]);

    printf("Enter size of second array: ");
    scanf("%d", &n2);

    printf("Enter elements of second array:\n");
    for (i = 0; i < n2; i++)
        scanf("%d", &b[i]);

    // Merge arrays into c
    for (i = 0; i < n1; i++)
        c[j++] = a[i];

    for (i = 0; i < n2; i++)
        c[j++] = b[i];

    n = n1 + n2;

    printf("\nThe merged array is:\n");
    for (i = 0; i < n; i++)
        printf("%d ", c[i]);

    printf("\n");
    return 0;
}

