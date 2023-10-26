package writingPractice;

public class Programme_2 {
    //declare two static varibles
    static int a = 100;
    static int b = 200;
    //declare one static method
    //call both static variables into the static method inside the print statement
    public static void staticMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    //declare the main method
    //call the static method into the main method and run the programme.
    public static void main(String[] args) {
        staticMethod();
    }
}
