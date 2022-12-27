package crew;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hakob extends StudentInfo {

    @Override
    public String method() {



        System.err.println("Enter the date when you were applied in the following format Month/Day/Year->four digits:");

        String jobApplyDate = new Scanner(System.in).next();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("M/d/y");

        LocalDate jobApD = LocalDate.parse(jobApplyDate,df);

        int experience = LocalDate.now().getYear() - jobApD.getYear();
        if(experience > 1){
            return String.valueOf(experience) + " years";
        }else {
            return String.valueOf(experience) + " year";
        }

    }


}

/*
1.Hakob
Your method should request from user to fill up :
-Date when person was applied for job  (AC- Use LocalDate method)
                (AC- Your method should calculate quantity of years of experience from application date till nowadays)

(AC general - Every request directed to user must be Highlighted by console)
 */
