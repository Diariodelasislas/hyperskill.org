package tictactoe;

import java.util.Scanner;

public class SimpleTicTacToe {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char[][] symbols = new char[3][3];
        boolean counter = true;
        boolean xWin = false;
        boolean oWin = false;
        int blank = 0;
        int counter0 = 0;
        int chessPiecesCounter = 2; 

        String input = scanner.nextLine().replace("_"," ");
        int inputCharAt = 0;
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols[i].length; j++) {
                symbols[i][j] = input.charAt(inputCharAt);
                inputCharAt++;
            }
        }
        
        System.out.println("---------");
        System.out.println("| " + symbols[0][0] + " " + symbols[0][1] + " " + symbols[0][2] + " |");
        System.out.println("| " + symbols[1][0] + " " + symbols[1][1] + " " + symbols[1][2] + " |");
        System.out.println("| " + symbols[2][0] + " " + symbols[2][1] + " " + symbols[2][2] + " |");
        System.out.println("---------");
        while(counter) { 
            int row = scanner.nextInt();
            int list = scanner.nextInt();
   

            for (int k = 0; k < symbols.length; k++) {
                for (int f = 0; f < symbols[k].length; f++) {
                if (symbols[k][f] == ' ') {
                    blank++;
                }  
 
                if (k == 0 && symbols[k][f] == 'X' && symbols[k + 1][f] == 'X' && symbols[k + 2][f] == 'X') {
                    xWin = true;
                }
            
                if (k == 0 && symbols[k][f] == 'O' && symbols[k + 1][f] == 'O' && symbols[k + 2][f] == 'O') {
                    oWin = true;
                }
            
                if (f == 0 && symbols[k][f] == 'X' && symbols[k][f + 1] == 'X' && symbols[k][f + 2] == 'X') {
                    xWin = true;
                }
            
                if (f == 0 && symbols[k][f] == 'O' && symbols[k][f + 1] == 'O' && symbols[k][f + 2] == 'O') {
                    oWin = true;
                }
            
                if (k == 0 && f == 0 && symbols[k][f] == 'X' && symbols[k + 1][f + 1] == 'X' && symbols[k + 2][f + 2] == 'X' || k == 0 && f == 2 && symbols[k][f] == 'X' && symbols[Math.abs(k - 1)][Math.abs(f - 1)] == 'X' && symbols[Math.abs(k - 2)][Math.abs(f - 2)] == 'X') {
                    xWin = true;
                }
            
                if (k == 0 && f == 0 && symbols[k][f] == 'O' && symbols[k + 1][f + 1] == 'O' && symbols[k + 2][f + 2] == 'O' || k == 0 && f == 2 && symbols[k][f] == 'O' && symbols[Math.abs(k - 1)][Math.abs(f - 1)] == 'O' && symbols[Math.abs(k - 2)][Math.abs(f - 2)] == 'O') {
                    oWin = true;
                }   
            }
            }
            
             
            if ( row <=3 && row >= 1 && list <= 3 && list >= 1 && symbols[Math.abs(row - 1)][Math.abs(list - 1)] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
            } else if (row <=3 && row >= 1 && list <= 3 && list >= 1) {
                if (chessPiecesCounter % 2 == 0) {
                   symbols[Math.abs(row - 1)][Math.abs(list - 1)] = 'X'; 
                }
                System.out.println("---------");
                System.out.println("| " + symbols[0][0] + " " + symbols[0][1] + " " + symbols[0][2] + " |");
                System.out.println("| " + symbols[1][0] + " " + symbols[1][1] + " " + symbols[1][2] + " |");
                System.out.println("| " + symbols[2][0] + " " + symbols[2][1] + " " + symbols[2][2] + " |");
                System.out.println("---------");
                chessPiecesCounter++;
                break;
            } else if (row > 3 || row < 1 || list > 3 || list < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else {
                System.out.println("You should enter numbers!");
            } 
        if (xWin) {
            System.out.println("X wins");
            break;
            } else if (oWin) {
                System.out.println("O wins");
                break;
            } else {
                if (blank == 0) {
                    System.out.println("Draw");
                     break;
                }
            }
        blank = 0;
        } 
             
    }
}