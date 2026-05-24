package Loops.DoWhileLoop;

public class Black {
    /*The do-while loop in Java (and many other languages)
    is a control flow statement that executes a block of
    code at least once, and then repeats it as long as a
    specified condition is true.*/
    public static void main(String[] args) {
        int i = 9;
        do {
            System.out.println(i);
            i++;
        } while (i<=5);
        System.out.println("out of loop");
    }
}
