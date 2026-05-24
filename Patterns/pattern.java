import java.util.Scanner;

public class pattern {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        
        // numTriangle(rows);

        // starSquare(rows);
        
        // numSqPattern(rows);

        // starLine(rows);

        // rightTriangle(rows);

        // rightInverse(rows);

        // binaryPattern(rows);

        // sandswitch(rows);

        // leftTriangle(rows);

        // invertrdleftTriangle(rows);

        // pyramid(rows);             // code for inverted also in it

        // pyramid2(rows);

        diamond(rows);

        // diamond2(rows);

        // alphaPattern(rows);

        // inversealphaPattern(rows);

        // alphaPyramid(rows);
    }

    public static void numTriangle(int rows) {
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void starSquare(int rows) {
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }   
    }

    public static void numSqPattern(int rows) {
        for(int i = 0; i <= rows; i++){
            for(int j = 0; j <= rows; j++){
                System.out.print(i+""+j + " ");  // (" "+i+j)
            }
            System.out.println();
        }
    }

    public static void starLine(int rows) {
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("  ");
        }
    }

    public static void rightTriangle(int rows) {
        for(int i = 0; i <= rows; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void rightInverse(int rows) {
        for(int i = rows; i >=  0; i--){
            for (int j = 1 ; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void binaryPattern(int rows) {
        for(int i = 0; i <=  rows; i++){
            for (int j = 0 ; j <= i; j++) {
                if((i+j) % 2 == 0)
                    System.out.print(0 + " ");
                else
                    System.out.print(1 + " ");
            }
            System.out.println();
        }
    }

    public static void sandswitch(int rows){
        for(int i = 0; i <= rows; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = rows; i >=  0; i--){
            for (int j = 1 ; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int rows){
        
        // for (int i = 1; i <= rows; i++) {

        for (int i = rows; i > 0; i--) {     // for inverted pattern

            //spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }

            // star
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pyramid2(int rows){
        
        for (int i = 1; i <= rows; i++) {

            //spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }

            // star
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void leftTriangle(int rows){
        
        for (int i = 0; i <= rows; i++) {

            //spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }

            // star
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void invertrdleftTriangle(int rows){
        
        for (int i = rows; i > 0; i--) {

            //spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }

            // star
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void diamond(int rows){
        for (int i = 1; i < rows; i++) {

            //spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }

            // star
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {

            //spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }

            // star
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void diamond2(int rows){
        for (int i = 1; i < rows; i++) {

            //spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }

            // star
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {

            //spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }

            // star
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void alphaPattern(int rows){

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }

    public static void inversealphaPattern(int rows){

        for (int i = rows; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }

    public static void alphaPyramid(int rows){
        for (int i = 0; i < rows; i++) {
            // space
            for (int j = 0; j < rows-i; j++) {
                System.out.print("  ");
            }
            // alphabate
            for (int j = 0; j <= 2*i-1; j++) {
                System.out.print((char)('A' + j) +" ");  
            }

            System.out.println();
        }
    }
}