import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] map = {
            {'X', '.', '.', '.', '.'},
            {'.', '.', 'X', '.', '.'},
            {'.', '.', '.', '.', 'T'},
            {'X', '.', '.', '.', '.'},
            {'.', '.', 'X', '.', '.'}
        };

        System.out.println("=== TREASURE HUNT ===");
        System.out.println("Find the treasure (T)!");

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter row (0-4): ");
        int row = sc.nextInt();

        System.out.print("Enter column (0-4): ");
        int col = sc.nextInt();

        if (row >= 0 && row < 5 && col >= 0 && col < 5) {
            if (map[row][col] == 'T')
                System.out.println("Congratulations! You found the treasure!");
            else if (map[row][col] == 'X')
                System.out.println("Oops! You found an obstacle.");
            else
                System.out.println("No treasure here. Try again!");
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}
