def display(board):
    for row in board:
        print(" ".join(row))


def is_safe(board, row, col, n):
    # Check column
    for i in range(row):
        if board[i][col] == "Q":
            return False

    # Check upper-left diagonal
    i, j = row - 1, col - 1
    while i >= 0 and j >= 0:
        if board[i][j] == "Q":
            return False
        i -= 1
        j -= 1

    # Check upper-right diagonal
    i, j = row - 1, col + 1
    while i >= 0 and j < n:
        if board[i][j] == "Q":
            return False
        i -= 1
        j += 1

    return True


def place_queens(board, row, n):
    if row == n:
        return True

    for col in range(n):
        if is_safe(board, row, col, n):
            board[row][col] = "Q"

            if place_queens(board, row + 1, n):
                return True

            board[row][col] = "."

    return False


n = 4
chessboard = [["." for _ in range(n)] for _ in range(n)]

if place_queens(chessboard, 0, n):
    display(chessboard)
else:
    print("No solution found.")
