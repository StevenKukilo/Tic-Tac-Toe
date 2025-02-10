import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    Ini perubahan

    public static void main(String[] args) {

        new Main();

    }
    public Main(){
        Board papan = new Board();
        Scann scan = new Scann();
        while(true){
            papan.printBoard();
            System.out.println("Input koordinat[x,y]: ");

            Koordinat koordinat = scan.scan();

            if(!papan.checkBoard(koordinat)){
                continue;
            }

            char player;
            boolean player1 = true;
            if(player1){
                player = 'O';
                player1 = false;
            }
            else{
                player = 'X';
                player1 = true;
            }
            int movement = 0;
            movement++;
            papan.setBoard(koordinat,player);
            boolean win = papan.checkWin(player);


            if(player1){
                if(win){
                    System.out.println("Player 2 win!!!");
                    break;
                }
            }
            else{
                if(win){
                    System.out.println("Player 1 win!!!");
                    break;
                }
            }
            if(movement == 9){
                System.out.println("Draw!!!");
                break;
            }
        }
    }




}