package ru.itis;


public class Main {

    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int m = 7;
        int n = 7;

        String[][] matrix = new String[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = "-";
                matrix[0][j] = "*";
                matrix[i][0] = "*";
                matrix[i][n - 1] = "*";
                matrix[m - 1][j] = "*";
                // walls
                matrix[1][2] = "*";
                matrix[2][2] = "*";
                matrix[2][3] = "*";
                matrix[3][3] = "*";
                matrix[3][4] = "*";
                matrix[4][3] = "*";
                matrix[5][5] = "*";
                matrix[4][2] = "*";
            }
        }


        matrix[1][1] = "0";
        matrix[1][5] = "x";

        int fl = 0;
        int length = 1000;

        for (int c = 0; c < m; c++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (checkString(matrix[i][j])) {
                        if (Integer.parseInt(matrix[i][j]) == fl) {
                            int a = 0;
                            if (matrix[i - 1][j].equals("-")) {
                                matrix[i - 1][j] = Integer.toString(fl + 1);
                                a++;
                            }
                            if (matrix[i][j + 1].equals("-")) {
                                matrix[i][j + 1] = Integer.toString(fl + 1);
                                a++;
                            }
                            if (matrix[i + 1][j].equals("-")) {
                                matrix[i + 1][j] = Integer.toString(fl + 1);
                                a++;
                            }
                            if (matrix[i][j - 1].equals("-")) {
                                matrix[i][j - 1] = Integer.toString(fl + 1);
                                a++;
                            }
                            if (a != 0)
                                fl++;
                            if ((matrix[i - 1][j].equals("x") || matrix[i][j + 1].equals("x") || matrix[i + 1][j].equals("x") || matrix[i][j - 1].equals("x")) && length > Integer.parseInt(matrix[i][j]))
                                length = Integer.parseInt(matrix[i][j]);
                        }
                    }

                }

            }
        }

        if (length != 1000) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("The shortest length of way is " + length);
        } else
            System.out.println("There's a wall!");
    }
}
