public class DecimalToHexadecimal {
    public static void main(String[] args) {
        decToHex(100);
    }

    static void decToHex(int n) {
        String hex = "";
        
        while (n > 0) {
            int rem = n % 16;
            if (rem < 10) {
                hex += rem;
            } else {
                hex = (char)(rem + 55) + hex;
            }
            n /= 16;
        }
        System.out.println(hex);
    }
}
