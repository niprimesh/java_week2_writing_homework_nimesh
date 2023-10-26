package writingPractice;

public class Programme_1 {
    //1.1 declare two instance variables
    int a = 10;
    int b = 20;

    //declare instance method
    //call both instance variables into the instance method inside the print
    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    //declare the main method.
    //call the above instance method into the main method and run the programm
    public static void main(String[] args) {
        Programme_1 programme_1 = new Programme_1();
        programme_1.instanceMethod();
    }
}
