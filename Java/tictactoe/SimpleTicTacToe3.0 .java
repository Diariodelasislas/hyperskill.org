import java.util.Scanner;

public class SimpleTicTacToe {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String strings = scanner.next();
        char[] symbols = new char[9];
        boolean xWin = false;
        boolean oWin = false;
        int x = 0;
        int o = 0;
        int blank = 0;
        int counter = 0;
        int lineX = 0;
        int lineO = 0;

        System.out.println("Enter cells: ");
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = strings.charAt(i);
            if (symbols[i] == 'X') {
                x++;
            } else if (symbols[i] == 'O') {
                o++;
            } else {
                blank++;
            }
        }

        System.out.println("---------");
        System.out.println("| " + symbols[0] + " " + symbols[1] + " " + symbols[2] + " |");
        System.out.println("| " + symbols[3] + " " + symbols[4] + " " + symbols[5] + " |");
        System.out.println("| " + symbols[6] + " " + symbols[7] + " " + symbols[8] + " |");
        System.out.println("---------");

        for (int j = 0; j < symbols.length; j++) {
            if (counter == 3) {
              lineX = 0;
              lineO = 0;
              counter = 0;  
            }

            if (symbols[j] == 'X') {
                ++lineX;
                if (lineX == 3) {
                    xWin = true; 
                }
            }

            if (symbols[j] == 'O') {
                ++lineO;
                if (lineO == 3) {
                    oWin = true;
                }
            }

            if (j < 3 && symbols[j] == 'X' && symbols[j + 3] == 'X' && symbols[j + 6] == 'X') {
                xWin = true;
            }

            if (j < 3 && symbols[j] == 'O' && symbols[j + 3] == 'O' && symbols[j + 6] == 'O') {
                oWin = true;
            }

            if (j == 0 && symbols[j] == 'X' && symbols[j + 4] == 'X' && symbols[j + 8] == 'X' || j == 2 && symbols[j] == 'X' && symbols[j + 2] == 'X' && symbols[j + 4] == 'X' && j == 2) {
                xWin = true;
            }

            if (j == 0 && symbols[j] == 'O' && symbols[j + 4] == 'O' && symbols[j + 8] == 'O' || j == 2 && symbols[j] == 'O' && symbols[j + 2] == 'O' && symbols[j + 4] == 'O' && j == 2) {
                oWin = true;
            }   
            counter++;
        }

        if (Math.abs(x - o) != 0 && Math.abs(x - o) != 1 || xWin == true && oWin == true) {
            System.out.println("Impossible");
        } else if (xWin) {
            System.out.println("X wins");
        } else if (oWin) {
            System.out.println("O wins");
        } else if (blank != 0) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }

    }
}