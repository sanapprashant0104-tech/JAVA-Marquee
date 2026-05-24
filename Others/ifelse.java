public class ifelse {
    public static void main(String[] args) {


        for(int i = 1; i <= 10; i++){
            if(i%2==0)
                System.out.println(i);
        }

        System.out.println();

        sumOfWholeNum();

        System.out.println();

        charge();


    }


    public static void sumOfWholeNum(){
        System.out.println("sumOfWholeNum function called");

        int sum = 0;
        for(int i = 0; i <= 30; i++){
            if(i % 2 == 0)
                sum += i;
        }

        System.out.println(sum);
    }


    public static void charge(){
        System.out.println("charge function called");
        int battary = 10;
        int count = 0;

        while(battary != 100){
            if (battary % 10 == 0) {
                count++;
            }
            battary++;
        }

        System.out.println(count);
    }
}



