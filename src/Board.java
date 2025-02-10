import java.util.Arrays;

public class Board {
    private final char[][] board = new char[3][3]; //inisialisasi ukuran

    public Board(){
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }


    }

    public boolean checkBoard(Koordinat koordinat){
        return board[koordinat.y][koordinat.x] == ' ';
    }

    public void setBoard(Koordinat koordinat,  char player){
        board[koordinat.y][koordinat.x] = player;
    }

    public boolean checkWin( char player) {
        if(board[0][0] == player && board[1][0] ==player && board[2][0] == player){
            return true;
        } else if (board[0][1] == player && board[1][1] == player && board[2][1] == player) {
            return true;
        } else if (board[0][2] == player && board[1][2] == player && board[2][2] == player) {
            return true;
        } else if (board[0][0] == player && board[0][1] ==player && board[0][2] == player) {
            return true;
        } else if (board[1][0] == player && board[1][1] ==player && board[1][2] == player) {
            return true;
        } else if (board[2][0] == player && board[2][1] ==player && board[2][2] == player) {
            return true;
        } else if (board[0][0] == player && board[1][1] ==player && board[2][2] == player) {
            return true;
        } else if (board[2][0] == player && board[1][1] ==player && board[0][2] == player) {
            return true;
        }
        return false;
    }

    public void printBoard(){
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}


