//This is the program that is determine the math calculations

import java.util.Scanner;

public class mathTaskSix{
    public static void main(String[] args){
        Scanner math = new Scanner(System.in);

        //Let input the user prompt to enter the number
        System.out.println("Enter the no: ");
        double number = math.nextDouble();

        //Display the sqrt
        System.out.println("Square Root: " + Math.sqrt(number));

        //Display the power of squared
        System.out.println("No of squared: "+ Math.pow(number, 2));

        //Display the value of the rondom number
        System.out.println("Value of the random number: "+  Math.random());

        //Display the no of Pi
        System.out.println("Value of Pi: "+ Math.PI);

        math.close();

    }
}