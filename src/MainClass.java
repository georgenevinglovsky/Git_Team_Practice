import crew.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class MainClass {
    public static void main(String[] args) {
       ArrayList<StudentsFunctions> listOfFunctions = new ArrayList<>(Arrays.asList(new Hannan(),new Hamid(),new Hakob(),new Saiana(), new Robert(), new John(), new Faith()));

        for (StudentsFunctions student : listOfFunctions) {
            student.method();
        }
    }
}
