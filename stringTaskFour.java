import java.util.Scanner;

public class stringTaskFour{
    public static void main(String[] args){
        Scanner comparison = new Scanner (System.in);

        System.out.println("Enter First String: ");
        String strOne = comparison.nextLine();

        System.out.println("Enter Second String");
        String strTwo = comparison.nextLine();

        // check whether string one and string two are the same 

        if (strOne.equals(strTwo)){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }

        System.out.println("length of string: "+ strOne.length());
        System.out.println(" lengthe of string two: "+ strTwo.length());

        comparison.close();
    }
}