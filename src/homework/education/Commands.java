package homework.education;

public interface Commands{
    String EXIT = "0";
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_STUDENTS_BY_LESSON = "4";
    String PRINT_LESSONS = "5";
    String DELETE_LESSON_BY_NAME = "6";
    String DELETE_STUDENT_BY_EMAIL = "7";
    String LOGIN = "1";
    String BACK = "0";
    String PRINT_MY_LESSONS = "1";
    String EDITH_MY_ACCOUNT = "2";
    String DELETE_MY_ACCOUNT = "3";
    String ADD_LESSONS = "4";
    String DELETE_LESSON = "5";
    String REGISTRATION="2";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENT_BY_EMAIL");
    }

    static void printNewCommand() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOGIN + " for LOGIN");
        System.out.println("Please input " + REGISTRATION + " for REGISTRATION");

    }

    static void printUserCommand() {
        System.out.println("Please input " + BACK + " for BACK");
        System.out.println("Please input " + PRINT_MY_LESSONS + " for PRINT_MY_LESSONS");
        System.out.println("Please input " + EDITH_MY_ACCOUNT + " for EDITH_MY_ACCOUNT");
        System.out.println("Please input " + DELETE_MY_ACCOUNT + " for DELETE_MY_ACCOUNT");
        System.out.println("Please input " + ADD_LESSONS + " for ADD_LESSONS");
        System.out.println("Please input " + DELETE_LESSON + " for ADD_LESSONS");

    }


}
