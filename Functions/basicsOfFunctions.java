
import java.util.*;
public class basicsOfFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // function call without static keyword
        // functions obj = new functions();
        // obj.abc(age);

        // function call with static keyword
        // abc(age);

        int mul = multiply(x, y);
        System.out.println(mul);
        
    }

    // static void abc(int age) {
    void abc(int age) {
        age = 26;

        if (age < 18)
            System.out.println("Child");
        else if (age <= 18 && age <40)
            System.out.println("Aduld");
        else
            System.out.println("Senior");
    }


    public static int multiply(int x, int y) {
        return x*y;
    }
}
