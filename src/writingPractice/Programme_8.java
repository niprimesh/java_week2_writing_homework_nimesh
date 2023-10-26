package writingPractice;

import java.util.Scanner;

public class Programme_8 {
    public static void main(String[] args) {
        //scanner declaraton for reading input from console
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter the length of tringle :");
        int lenght = scanner.nextInt();
        System.out.println(" please enter the height of tringle: ");
        int height = scanner.nextInt();
        areaOfTringle (height, lenght);
        //clsoing scanner
        scanner.close();
    }
    //calculate area of tringle with no return type with paratmeter method
    public static void areaOfTringle(int lenght, int height){
        int area= (lenght * height)/2;
        System.out.println("The area of tringle is :" +area);
    }
}
