import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        String roll = sc.nextLine();

        // Calender(month);

        Roll(roll);

        
    }

    public static void Roll(String post){
        switch (post) {
            case "admin":
                System.out.println("Full Access");
                break;
            case "student":
                System.out.println("Only Student Portal");
                break;
            case "teacher":
                System.out.println("Teacher & Student Portal");
                break;
            case "Guest":
                System.out.println("View Only");
                break;
        
            default:
                break;
        }
    }

    public static void Calender(int month){
    switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Des");
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}

