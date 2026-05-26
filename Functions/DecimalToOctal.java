public class DecimalToOctal {
    public static void main(String[] args) {
        decToOct(324);
    }

    static void decToOct(int n) {
        int pow = 0;
        int oct = 0;

        while(n > 0) {
            int rem = n % 8;
            oct = oct + (rem * (int)Math.pow(10, pow));
            pow++;
            n /= 8;
        }
        System.out.println(oct);
    }
}
