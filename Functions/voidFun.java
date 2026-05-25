import java.util.Scanner;

public class voidFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String clg = sc.nextLine();

        greet(st, clg);
    }

    static void greet(String student, String collage) {
        System.out.println("Hello " + student + ", Welcome to " + collage);
    }
}