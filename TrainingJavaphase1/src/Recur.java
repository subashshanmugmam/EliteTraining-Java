public class Recur {
    public static void main(String[] args) {
        System.out.println(num(10));
    }
    static int num(int number){
        if (number==1){
            return 0;
        }
        else if (number==2){
            return 1;
        }

        return num(number-1)+num(number-2);
    }
}
