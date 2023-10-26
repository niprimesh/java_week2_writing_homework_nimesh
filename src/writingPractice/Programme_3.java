package writingPractice;

public class Programme_3 {
    //declare one instance and one static variable.
    String name = "prime";
    static String surname = "Testing";

    //Declare one instance method.
    //call both instance and static varibles into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme_3.surname);
    }

    //declare one static method
    //call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Programme_3 programme_3 = new Programme_3();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }

    //Declare the main method.
//call both instance and static methods into the main method and run the programme.
    public static void main(String[] args) {
        Programme_3 programme_3 = new Programme_3();
        programme_3.instanceMethod();
        staticMethod();
    }
}
