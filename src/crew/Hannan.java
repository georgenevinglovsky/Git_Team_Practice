package crew;

public class Hannan extends StudentInfo {
    public String checkString(String str){

        if (str.isEmpty() || str.isBlank()){
            //throw new RuntimeException("Username can not be empty or blank!");
            System.err.println("Name and surname can not be empty or blank!");
            System.exit(1);
        }

        if (!Character.isUpperCase(str.charAt(0))){
            System.err.println("Name and surname should be start with upper case!");
            System.exit(1);
        }

        boolean isLetter = false;

        for (int i = 0; i <str.length() ; i++) {

            if (Character.isLetter(str.charAt(i))){
                isLetter = true;
            }else {
                isLetter=false;
            }

        }

        if (!isLetter){
            System.err.println("Name and surname should contain only letter");
            System.exit(1);
        }

        return str;
    }

    private String name, surname;


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String method() {

        return  checkString(name) + " " + checkString(surname);
    }

    @Override
    public String toString() {
        return "Hannan{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
/*
1.Hannan
Your method should request from user to fill up :
-Name  (AC- Should not be blank or empty.
            Should start from big letter.
            Must have only Letters.)
-Surname  (AC- Should not be blank or empty.
               Should start from big letter.
               Must have only Letters.)
(AC general - Every request directed to user must be Highlighted by console)
 */

/*
if (surname.isEmpty() || surname.isBlank()){
            //throw new RuntimeException("Username can not be empty or blank!");
            System.err.println("Name should be start with upper case!");
        }

        if (!Character.isUpperCase(surname.charAt(0))){
            System.err.println("Name should be start with upper case!");
        }
 */