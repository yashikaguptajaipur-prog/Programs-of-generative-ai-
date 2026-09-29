#include <stdio.h>
#include <string.h>

#define MAX_ITEMS 50
#define MAX_SIZE 100

int main() {
    char items[MAX_ITEMS][MAX_SIZE];
    int total = 0;
    int choice;

    while (1) {
        printf("\n--- SHOPPING LIST ---\n");
        printf("1. Add Item\n");
        printf("2. View List\n");
        printf("3. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);
        getchar();

        if (choice == 1) {
            if (total < MAX_ITEMS) {
                printf("Enter item: ");
                fgets(items[total], MAX_SIZE, stdin);

                items[total][strcspn(items[total], "\n")] = '\0';
                total++;

                printf("Item added successfully.\n");
            }
        }
        else if (choice == 2) {
            printf("\nYour Shopping List:\n");

            for (int i = 0; i < total; i++) {
                printf("%d. %s\n", i + 1, items[i]);
            }
        }
        else if (choice == 3) {
            printf("Program closed.\n");
            break;
        }
        else {
            printf("Invalid choice.\n");
        }
    }

    return 0;
}
