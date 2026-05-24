import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        // System.out.println(-10%-3);
        // System.out.println(10%-3);
        // System.out.println(-10%3);


        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // float c = sc.nextInt();
        // // float f = ((9.0f/5)*c)+32;

        // System.out.println(((9.0/5)*c)+32);

        // System.out.println("Prashant\n Sujal");

        // int q = 3;

        // System.out.println("Shiv"+3);
        // System.out.println("Shiv"+q);

        // System.out.println(true>false);  // not allowed in java
        // System.out.println(true == false);

        // int x = 10, y = 30, z = 96;
        // System.out.println(x<y<z);    not allowed 

        // System.out.println(x + "\n" + y + "\n" + z);


        //  int count = 0;
        
        // while(true){
        //     int n = sc.nextInt();
        //     count++;
            
        //     if(n%2 != 0)
        //         break;
        // }
        // System.out.println(count);   
        
        
        // weekdays();

        // cal();







        // loops

        // for(int i = 1; i <= 20; i++){
        //     if(i%3 == 0)
        //         System.out.println(i);
        // }

        // int i = 1;
        // while (i <= 5) {
        //     System.out.println(i);
        //     i++;
        // }

        // int k = 1;
        // while (k <= 5) {
        //     System.out.println(i);
        // }


        // sqrt

        // int n = sc.nextInt();
        // for(int i = 1; i <= n/i; i++) {
        //     if(n == i*i) {
        //         System.out.println(i + " is sqrt of " + n);
        //         break;
        //     }
        // }



        // some of digits

        // int num = sc.nextInt();
        // int sum = 0;
        // while(num != 0){
        //     // int rem = num%10;
        //     // sum += rem;

        //     sum += num % 10;
        //     num /= 10;
        // }
        // System.out.println(sum);

    }



    


    public static void weekdays() {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedseday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Enter valid day");
                break;
        }
    }


    public static void cal() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char ch = sc.next().charAt(0);
        int b = sc.nextInt();

        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b == 0)
                    System.out.println("Zero Division Error");
                else
                    System.out.println(a/b);
                break;
            case '%':
                if(b == 0)
                    System.out.println("Zero Division Error");
                else
                    System.out.println(a%b);
                break;
        
            default:
                System.out.println("Enter valid operation");
                break;
        }
    }

}