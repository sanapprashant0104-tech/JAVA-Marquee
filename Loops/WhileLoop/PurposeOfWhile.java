package Loops.WhileLoop;

import java.util.Scanner;

public class PurposeOfWhile {
    public static void main(String[] args) {

        // we use while loop when we don't know how many times loop will run

        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;
        while (!hasLearnt) {
            System.out.println("Went to school, tried to learn.");
            System.out.println("Did you understood?");
            hasLearnt = sc.nextBoolean();
        }
        System.out.println("Congrats to you did it.");
    }
}
