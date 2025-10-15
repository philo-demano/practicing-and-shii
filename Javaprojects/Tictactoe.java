import java.util.Scanner;

public class Tictactoe{
    //array für game
   static char[][] game = new char[3][3];   

   public static void main(String[] args){
       //create empty board
       initializeBoard();

       //check current player(X oder O)
       char player1 = 'X';

       //check status of game
        boolean winner = false;
        boolean draw = false;

        //loop for game
        while(winner == false && draw == false){
           printBoard();
           System.out.println("Bitte" + player1 + "spielen. Enter; ");
           //player input
        
           int row = scanner.nextInt() - 1;
           int column = scanner.nextInt() - 1;

           //check if chosen cell is empty
            if(game[row][column] == ' '){
                game[row][column] = player1;

            //check if current player has won
                gameWon = checkWin(player1);
            
                 if(!gameWon){
                    draw = checkDraw();

                    //switsch player if game isnt won
                    player1 = (player1 == 'X')? 'X' : 'Y';
                 }
             } else{
                 System.out.println("This cell is already occupied");
             }
        }

        //Display the final game
        printBoard();

        //display winner
        if(gameWon){
            System.out.println("Player" + player1 + "has won");
        } else {
            System.out.println("It's a draw");
        }
        
        scanner.close();
    }

    //intializeBoard function
    public static void initializeBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                game[i][j] = ' ';
            }
        }
    }

    //print function
    public static void printBoard(){
        System.out.println(" 1 2 3");
        for(int i = 0; i < 3 ; i++){
            System.out.print((i + 1) + " ");
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j]);
                if(j < 2) System.out.print("|");
            }
            System.out.println();
            if(i < 2) System.out.print(" -----");
        }
    }

    //Function zum checkWon
    //check rows colummns und diagonals
    public static boolean checkWin(char player1){
        for(int i = 0; i < 3; i++){
           
        }
    }
}
