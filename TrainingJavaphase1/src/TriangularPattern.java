public class TriangularPattern {
    public static void main(String[] args) {
        int n=5;
        int m=1;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(m+" ");
                m++;

            }
            System.out.println();

        }
    }
}
