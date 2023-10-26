package writingPractice;

import java.util.Scanner;

/**
 * java programme to add two binary
 */

public class Programme_16AddBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to java program to add two binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first binary number");
        String first = scanner.nextLine();
        System.out.println("please enter second binary number");
        String second = scanner.nextLine();
        String additon = addTwoBinary(first, second);
        System.out.println("The addition of two binary number is :" + additon);
        //closing the scanner object
        scanner.close();
    }

    //adding the two binary numbers
    public static String addTwoBinary(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

}