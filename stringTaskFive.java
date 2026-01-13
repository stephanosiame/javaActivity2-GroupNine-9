/* The question 5 to use
* string declaration
*/

import java.util.Scanner;

public class stringTaskFive{
    public static void main(String[] args){
        Scanner task = new Scanner(System.in);
        //Input the student details
        System.out.println("Enter Student Name: ");
        String name = task.nextLine();
        
        //Enter the registration number. 
        System.out.println("Enter the Reg No: ");
        String regNo = task.nextLine();

        //Enter the marks of the student
        int marks = task.nextInt();

        //Display the results 

        System.out.println("Name: "+ name);
        System.out.println("RegNo: "+ regNo);
        System.out.println("Mark: "+ marks);
        
        task.close();
    }
}