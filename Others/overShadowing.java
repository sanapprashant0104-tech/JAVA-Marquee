public class overShadowing {
    int a = 5;

    public void fun(int a){
        System.out.println(a);

        System.out.println(this.a);
        
    }
    public static void main(String[] args) {
        overShadowing obj = new overShadowing();
        obj.fun(10);
    }

}
