package writingPractice;

import java.util.Scanner;

/**
 * write java programme to convert a given string into lowercase.
 *
 */
public class Programme_19ConvertString {
    public static void main(String[] args) {
        //scanner declaration for reading input
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter uppercase sentence:");
        String uppercase = scanner.nextLine();
        Programme_19ConvertString obj = new Programme_19ConvertString();
        obj.convertString(uppercase);
    }
//convert string the lowercase
    public void convertString(String str){
        System.out.println("The lowercase of string is =" +str.toLowerCase());
    }
}
