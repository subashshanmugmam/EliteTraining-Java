public class SnakeBoard {
    public static void main(String[] args) {
        int c=10;
        int r=10;
        int [][] matrix=new int[r][c];
        int num=1;
        for (int i = r-1; i >=0; i--) {
            if(i%2==0){
                for (int j = c-1; j >=0 ; j--) {
                    matrix[i][j]=num;
                    num++;
                }
            }
            else{
                for (int j = 0; j <c ; j++) {
                    matrix[i][j]=num;
                    num++;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%4d",matrix[i][j]);

            }
            System.out.println();

        }
    }
}
