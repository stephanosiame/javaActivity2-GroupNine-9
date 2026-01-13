public class stringTaskTwo{

    public static void main(String[] args){
        //Variable name course name
        String CourseName = "Computer Science";
        char firstCharacter =CourseName.charAt(0);
        char lastChar = CourseName.charAt(15);
        String lengthWord = CourseName.substring(9);

        System.out.println("Course Name: "+ CourseName);
        System.out.println("First char: " + firstCharacter);
        System.out.println("Last Char: "+ lastChar);
        System.out.println("Word: " + lengthWord);


    }
}