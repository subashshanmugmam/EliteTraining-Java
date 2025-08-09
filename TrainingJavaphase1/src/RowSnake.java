public class RowSnake {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < 3; i++) {
            if (i % 2 != 0) {
                for (int j = arr.length-1; j >=0; j--) {

                    System.out.print(arr[i][j]+" ");
                }


            }
            else{
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
