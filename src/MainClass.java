import crew.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
       ArrayList<StudentInfo> describtion = new ArrayList<>(Arrays.asList(new Hannan(),new Hamid(),new Hakob(), new Robert(), new John(), new Faith(),new Saiana(), new Meiyin(), new Aimaiti()));

        for (StudentInfo infromationUnit : describtion) {
            infromationUnit.method();
        }

        System.out.println(
                " Name and Surname: "+describtion.get(0)+
                "\n Date of birth: "+describtion.get(1)+
                "\n Date when person was applied for job and years of experience: "+describtion.get(2)+
                "\n Approx salary: "+describtion.get(3)+
                "\n Email domain:"+describtion.get(4)+
                "\n List of hobbies: "+describtion.get(5)+
                "\n Student ID: "+describtion.get(6)+
                "\n Weight and height of user: "+ describtion.get(7) +
                "\n Place of birth: " + describtion.get(8));
    }
}
