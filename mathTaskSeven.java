//The Qustion that uding Date and time classes

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class mathTaskSeven{
    public static void main(String[] args){
        //To desplay the current date
        LocalDate RecentDate = LocalDate.now();
        System.out.println("Date of Today: "+ RecentDate);

        //current time of now 
        LocalTime RecentTime = LocalTime.now();
        System.out.println("Current time: "+ RecentDate);

        //Time of to daya and date
        LocalDateTime current_Date_Time = LocalDateTime.now();
        System.out.println("The Date: "+ current_Date_Time );

        //Get year
        System.out.println("Year we in: "+ RecentDate.getYear());
    }
}