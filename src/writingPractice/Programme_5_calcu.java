package writingPractice;

import java.util.Scanner;

public class Programme_5_calcu {
    //static methods
    public static void addition (int a , int b){
        int result = a +b;
        System.out.println("the additon of " +a+ "and"+b+ " is :  " +result);
    }
    public static int substraction (int a , int b){
        return a-b;
    }
    //instance method
    public  void multiplication (int a , int b){
        int result = a *b;
        System.out.println("the multiplication of " +a+ "and"+b+ " is :  " +result);
    }
    public  int division (int a , int b){
        int result = a /b;
        return result;
    }

    public static void main(String[] args) {
        //scanner declaration for reading input for console
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter first: ");
        int a = scanner.nextInt();
        System.out.println("please enter second number:");
        int b= scanner.nextInt();
        addition(a,b);

        int sunResult = substraction(a,b);
        System.out.println("the substraction of " +a+ "and" +b+ "is :"+sunResult);
        Programme_5_calcu obj = new Programme_5_calcu();

        obj.multiplication(a,b);

        int divResult = obj.division(a,b);
        System.out.println("the division of " +a+ "and " +b+ "is :" +divResult);
        //closing the scaner object
        scanner.close();

    }
}
