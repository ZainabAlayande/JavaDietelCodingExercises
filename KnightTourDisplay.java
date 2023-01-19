package ChapterEight;

public class KnightTourDisplay {

    static String[][] chessBoard = new String[8][8];

    public static void main(String[] args) {
        setArray();
        displayArray();

    }

        public static void setArray() {

            for (int i = 0; i < chessBoard.length; i++) {
                for (int j = 0; j < chessBoard.length; j++) {
                    chessBoard[1][3] = "2";
                    chessBoard[2][2] = "3";
                    chessBoard[3][4] = "K";
                    chessBoard[4][2] = "4";
                    chessBoard[5][3] = "5";
                    chessBoard[1][5] = "1";
                    chessBoard[2][6] = "0";
                    chessBoard[4][6] = "7";
                    chessBoard[5][5] = "6";
                }
            }
        }


        public static void displayArray() {
            for (int i = 0; i < chessBoard.length; i++) {
                System.out.print("[");
                for (int j = 0; j < chessBoard.length; j++) {
                    if (chessBoard[i][j] == null) {
                        System.out.print("      ");
                    } else {
                        int spaces = (6 - chessBoard[i][j].length()) / 2;
                        for (int k = 0; k < spaces; k++) {
                            System.out.print(" ");
                        }
                        System.out.print(chessBoard[i][j]);
                        for (int k = 0; k < spaces + 1; k++) {
                            System.out.print(" ");
                        }

                    }
                    if (j < 7) {
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                System.out.println();
                System.out.println();

            }

        }

    }

