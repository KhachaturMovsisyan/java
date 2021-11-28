package homework.education;

import java.util.Scanner;

public class StudentLessonDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static LessonStorage lessonStorage = new LessonStorage();
    private static StudentStorage studentStorage = new StudentStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    public static void main(String[] args) {

        lessonStorage.add(new Lesson("Java", 5, "core", 50000));
        studentStorage.add(new Student("poxos", "poxosyan", 55, "poxos@mail.ru", "093333333", lessonStorage.getByIndex(0)));


        boolean isRun = true;
        while (isRun) {
            printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.printStudent();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.printLessons();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("invalid command!");
            }
        }


    }

    private static void deleteStudentByEmail() {
        System.out.println("Please input student's email");
        String email = scanner.nextLine();
        if (studentStorage.getByEmail(email) != null) {
            studentStorage.deleteStudentByEmail(email);
        } else {
            System.out.println("wrong email");
        }


    }

    private static void deleteLessonByName() {
        System.out.println("Please input lesson's name");
        String name = scanner.nextLine();
        if (lessonStorage.getLessonByName(name) != null) {
            lessonStorage.deleteLessonByName(name);
        } else {
            System.err.println("wrong lesson name");
        }

    }


    private static void printStudentByLesson() {
        System.out.println("Please input lesson's name");
        String name = scanner.nextLine();
        if (lessonStorage.getLessonByName(name) != null) {
            studentStorage.printStudentByLesson(name);
        } else {
            System.err.println("wrong lesson name");
        }

    }


    private static void addStudent() {

        System.out.println("please input student's name");
        String name = scanner.nextLine();
        System.out.println("please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("please input student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input student's email");
        String email = scanner.nextLine();
        System.out.println("please input student's phone");
        String phone = scanner.nextLine();
        System.out.println("please input student's lesson name");
        String nameOfLesson = scanner.nextLine();

        if (studentStorage.getByEmail(email) == null) {
            if (lessonStorage.getLessonByName(nameOfLesson) != null) {
                Student student = new Student(name, surname, age, email, phone, lessonStorage.getLessonByName(nameOfLesson));
                studentStorage.add(student);
                System.out.println("student added");

            } else {

                System.out.println("lessen with this name doesnt exist");
            }
        } else {
            System.out.println("student with this email already exist");
        }
    }

    private static void addLesson() {
        System.out.println("please input lesson's name");
        String name = scanner.nextLine();
        System.out.println("please input lesson's duration");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("please input lesson's lecturerName");
        String lecturerName = scanner.nextLine();
        System.out.println("please input lesson's price");
        double price = Double.parseDouble(scanner.nextLine());
        if (lessonStorage.getLessonByName(name) == null) {
            Lesson lesson = new Lesson(name, duration, lecturerName, price);
            lessonStorage.add(lesson);
            System.out.println("lesson added");
        } else {
            System.out.println("lesson with this name already exist");
        }


    }

    private static void printCommands() {
        System.out.println("Please imput " + EXIT + " for EXIT");
        System.out.println("Please imput " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please imput " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please imput " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please imput " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please imput " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please imput " + DELETE_LESSON_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("Please imput " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENT_BY_EMAIL");
    }


}
