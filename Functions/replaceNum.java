public class replaceNum {
    public static void main(String[] args) {
        int n = 10101010;
        System.out.println(replace(n));;
    }

    static int replace(int n){
        int res = 0;
        while (n > 0) {
            if (n % 10 == 0) {
                res = (res*10) + 5;
            } else {
                res = (res*10) + (n%10);
            }
            n /= 10;
        }
        while (res > 0) {
            n = n * 10 + res % 10;
            res /= 10;
        }
        return n;
    }
}
