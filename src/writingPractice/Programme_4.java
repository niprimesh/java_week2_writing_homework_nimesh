package writingPractice;

public class Programme_4 {
    //declare two instance and two static variables
    //instance variable
    String Name = "Prime";
    String Surname = "Testing";
    //static variable
    static boolean a = true;
    static boolean b = false;

    //declare one instance method.
    //call all four instance and static variables into both instance and static method inside print statment
    public void instanceMethod() {
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);
    }

    //declare one static method
    //call all four instance and static variables into both instance and static methods inside theprint statement.
    public static void staticMethod() {
        Programme_4 programme_4 = new Programme_4();
        System.out.println(programme_4.Name);
        System.out.println(programme_4.Surname);
        System.out.println(a);
        System.out.println(b);
    }

    //declare the main method.
    //call both instane and static methods into the main method and run the programme.
    public static void main(String[] args) {
        Programme_4 programme_4 = new Programme_4();
        programme_4.instanceMethod();
        staticMethod();
    }
}
