package writingPractice;

import java.util.Scanner;
/**
 * JAVA program to convert decimal number to binary number
 */
public class Programme_17DecimaltoBinary {
    public static void main(String[] args) {
        //scanner declare to get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number:");
        int number = scanner.nextInt();
        convert(number);
    }

    //convert decimal to binary method
    public static void convert(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is :" + binary);
    }
}
