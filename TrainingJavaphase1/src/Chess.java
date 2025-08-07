import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=S.nextInt();
        int[][] matrix = new int[n][n];
        int[][] Ruthu=new int[n][n];
        int num;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {

                        matrix[i][j] = 0;
                        Ruthu[i][j]=1;
                    } else {

                        matrix[i][j] = 1;
                        Ruthu[i][j]=0;

                    }
                }
            }
            else{
                    for (int j = 0; j < n; j++) {


                        if (j % 2 == 0) {
                            matrix[i][j] = 1;
                            Ruthu[i][j]=0;
                        } else {
                            matrix[i][j] = 0;
                            Ruthu[i][j]=1;
                        }

                    }
                }
            }



            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");

                }
                System.out.println();

            }

        System.out.println("Option 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Ruthu[i][j] + " ");

            }
            System.out.println();

        }
        }

    }
