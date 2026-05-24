import java.util.Scanner;

public class areaOfCircle {

    public static float area(int rad){
        final float pi = 3.14f;
        return pi*rad*rad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();

        float Area = area(rad);
        System.out.println(Area);
    }
}
