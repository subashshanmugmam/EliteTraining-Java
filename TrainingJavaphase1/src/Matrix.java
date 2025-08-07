import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int[][] matrix1 =new int[3][3];
        System.out.println("Enter the Value for 1st (3X3) Matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j]=s.nextInt();
            }
        }
        Sum(matrix1);
//        int[][] matrix2 =new int[3][3];
//        System.out.println("Enter the Value for 2nd (3X3) Matrix");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matrix2[i][j]=s.nextInt();
//            }
//        }
//        int[][] matrix =new int[3][3];
//        System.out.println("Addtion of two Matrix");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matrix[i][j]=matrix1[i][j]+matrix2[i][j];
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        s.close();;
    }
    static void Sum(int[][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum= "+sum);
    }
}
