public class Exercise_1 {
    static int ulam(int n){
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1 ;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(ulam(5));
    }
}

