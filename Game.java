import javax.swing.JLabel;

public class Game {
    private String[][] board = new String[6][7];
    private String currentplayer = ("\u001B[31m" + "O" + "\u001B[0m");
    private String Winner;

    public Game() {
    }

    public Game(String currentplayer) {
        this.currentplayer = currentplayer;

    }

    public void togglePlayer() {
        this.currentplayer = this.currentplayer == ("\u001B[31m" + "O" + "\u001B[0m")
                ? ("\u001B[33m" + "O" + "\u001B[0m")
                : ("\u001B[31m" + "O" + "\u001B[0m");
    }

    public void setPosition(int Y) {
        for (int i = 5; i > -1; i--) {
            if (Y >= 0 && Y <= 6) {
                if (this.board[i][Y] == " ") {
                    this.board[i][Y] = this.currentplayer;
                    if (checkWin()) {
                        this.Winner = this.currentplayer;
                        break;
                    }
                    this.togglePlayer();
                    return;
                } else {
                    continue;
                }

            }
            System.out.println("inserisci un valore esatto");
            return;
        }

    }

    public boolean checkWin() {
        // check for 4 across
        for (int i = 5; i > -1; i--) {
            for (int j = 6; j > -1 + 3; j--) {
                if (this.board[i][j] == currentplayer &&
                        this.board[i][j - 1] == currentplayer &&
                        this.board[i][j - 2] == currentplayer &&
                        this.board[i][j - 3] == currentplayer) {
                    return true;
                }
            }
        }
        // up and down
        for (int i = 5; i > -1; i--) {
            for (int j = 6; j > -1; j--) {
                if (board[i][j] == currentplayer &&
                        board[i - 1][j] == currentplayer &&
                        board[i - 2][j] == currentplayer &&
                        board[i - 3][j] == currentplayer) {
                    return true;
                }
            }
        }
        // check upward diagonal
        for (int i = 5; i > -1; i--) {
            for (int j = 6; j > -1 + 3; j--) {
                if (board[i][j] == currentplayer &&
                        board[i - 1][j - 1] == currentplayer &&
                        board[i - 2][j - 2] == currentplayer &&
                        board[i - 3][j - 3] == currentplayer) {
                    return true;
                }
            }
        }
        // check downward diagonal
        for (int i = 5; i > -1 + 3; i--) {
            for (int j = 6; j > -1 + 3; j--) {
                if (board[i][j] == currentplayer &&
                        board[i - 1][j - 1] == currentplayer &&
                        board[i - 2][j - 2] == currentplayer &&
                        board[i - 3][j - 3] == currentplayer) {
                    return true;
                }
            }
        }
        return false;
    }

    public String[][] getBoard() {
        return board;
    }

    public String getCurrent() {
        return currentplayer;
    }

    public String toString() {
        String result = "   0   1   2   3   4   5   6\n";
        result += " _____________________________\n";
        for (int i = 0; i < 6; i++) {
            result += " | ";
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == null) {
                    board[i][j] = " ";
                }

                result += board[i][j];
                result += " | ";

            }
            result += "\n _____________________________\n";

        }
        result += "   0   1   2   3   4   5   6\n\n";
        return result;
    }

}
