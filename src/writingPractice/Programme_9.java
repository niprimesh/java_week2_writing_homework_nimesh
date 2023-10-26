package writingPractice;

import java.util.Scanner;

/**
 * write programme to convert the upper case to lower case.
 */
public class Programme_9 {
    public static void main(String[] args) {
        //scanner declaration for reading input from console.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the uppercase string:");
        String uppercase = scanner.nextLine();
        Programme_9 obj = new Programme_9();
        obj.convertUppercaseToLowercase(uppercase);
        //scanner closing
        scanner.close();
    }
    //convert upper case to lower case method
    public void convertUppercaseToLowercase(String text){
        System.out.println("the lowercase value is =" + text.toLowerCase());
    }
}
