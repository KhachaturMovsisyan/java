package homework.education;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.utill.DateUtil;

import java.util.Date;
import java.util.Scanner;

public class StudentLessonDemo implements Commands, DateUtil {
    private static Scanner scanner = new Scanner(System.in);
    private static LessonStorage lessonStorage = new LessonStorage();
    private static StudentStorage studentStorage = new StudentStorage();


    public static void main(String[] args) {


        Lesson[] lessons = new Lesson[2];
        lessons[0] = new Lesson("Java", 5, "core", 50000);
        lessons[1] = new Lesson("C", 10, "core", 50000);
        lessonStorage.add(lessons[1]);
        lessonStorage.add(new Lesson("Python", 14, "core", 50000));
//        studentStorage.add(new Student("poxos", "poxosyan", 55, "poxos@mail.ru", "093333333", lesso7ns, DateUtil.printMyTime(new Date())));
//        studentStorage.add(new Student("petros", "petrosyan", 15, "petros@mai.ru", "04444444", lessons, DateUtil.printMyTime(new Date())));

        boolean isRun = true;
        while (isRun) {
            Commands.printNewCommand();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTRATION:
                    registration();
                    break;
                default:
                    System.out.println("invalid command");
            }
        }

    }

    private static void registration() {
        System.out.println("Please input name, surname,age, email,phone, login,password");
        String student = scanner.nextLine();
        String[] split = student.split(",");
        String name = split[0];
        String surname = split[1];
        int age = Integer.parseInt(split[2]);
        String email = split[3];
        String phone = split[4];
        String login = split[5];
        String password = split[6];


        if (studentStorage.getByEmail(email) == null) {
            Student students = new Student(name, surname, age, email, phone, DateUtil.printMyTime(new Date()), login, password);
            studentStorage.add(students);
            System.out.println("Շնորհավորում եմ Դուք հաջողությամբ գրանցվել եք ;)");
        } else {
            System.out.println("Student with this email has already exist!!!");
        }
    }

    private static void login() {
        System.out.println("Please input login");
        String login = scanner.nextLine();
        System.out.println("Please input password");
        String password = scanner.nextLine();

        if (login.equals("login") && password.equals("password")) {
            loginApp();
        } else {
            Student currentStudent = studentStorage.getByLoginAndPassword(login, password);
            if (currentStudent == null) {
                System.out.println("Wrong login or password");
                System.out.println("Forgot your password? Type YES if you want to change your password");
                String rSp = scanner.nextLine();
                if (!rSp.equals("Yes")) {
                    login();
                } else {
                    System.out.println("Please input email and login");
                    String log = scanner.nextLine();
                    String[] logs = log.split(",");
                    String email = logs[0];
                    String logIn = logs[1];
                    Student st = studentStorage.getStudentByEmailandLogin(email, logIn);
                    if (st != null) {
                        System.out.println("Please input new Password");
                        String passWord = scanner.nextLine();
                        System.out.println("Please input new Password again");
                        String rePpassword = scanner.nextLine();
                        if (!passWord.equals(rePpassword)) {
                            System.out.println("Passwords aren't coincided");
                            return;
                        } else {
                            st.setPassword(password);
                            System.out.println("Password is changed!");
                        }
                    } else {
                        System.out.println("ERRROR");
                    }
                }
            } else {
                userUI(currentStudent);
            }
        }
    }

    private static void userUI(Student currentStudent) {
        boolean isRun = true;
        while (isRun) {
            Commands.printUserCommand();
            String commands = scanner.nextLine();
            switch (commands) {
                case BACK:
                    isRun = false;
                    break;
                case PRINT_MY_LESSONS:
                    studentStorage.printMyLesson(currentStudent);
                    break;
                case EDITH_MY_ACCOUNT:
                    editMyAccount(currentStudent);
                    break;
                case DELETE_MY_ACCOUNT:
                    deleteMyAccount(currentStudent);
                    break;
                case ADD_LESSONS:
                    addLessons(currentStudent);
                    break;
                case DELETE_LESSON:
                    deleteLesson(currentStudent);
                    break;
                default:
                    System.out.println("invalid command");
            }
        }

    }

    private static void deleteLesson(Student currentStudent) {
        System.out.println("Are you sure Yes or No");
        String delete = scanner.nextLine();
        if (delete.equals("Yes")) {

            System.out.println("Type lesson that you want to delete");
            String lessonName = scanner.nextLine();
            int index = 0;
            Lesson[] lessons = currentStudent.getLessons();
            for (int i = 0; i < lessons.length; i++) {
                if (lessons[i].equals(lessonStorage.getLessonByName(lessonName))) {
                    index = i;
                }
            }
            Lesson[] newlessons = new Lesson[lessons.length - 1];
            for (int i = index; i < lessons.length - 1; i++) {
                newlessons[i] = lessons[i + 1];
            }
            currentStudent.setLessons(newlessons);


            System.out.println("Lesson deleted!!");
        } else {

        }
    }


    private static void addLessons(Student currentStudent) {
        lessonStorage.printLessons();
        System.out.println("Please input lessons name");
        String name = scanner.nextLine();
        Lesson lessonByName = lessonStorage.getLessonByName(name);
        if (lessonByName != null) {
            Lesson[] lessons = currentStudent.getLessons();
            Lesson[] newLessons = new Lesson[lessons.length + 1];
            for (int i = 0; i < newLessons.length; i++) {
                newLessons[i] = lessons[i];
            }
            newLessons[newLessons.length - 1] = lessonByName;
            currentStudent.setLessons(newLessons);
            System.out.println("Lesson Add");
        }
    }

    private static void deleteMyAccount(Student currentStudent) {
        System.out.println("Are you sure? YES or NO");
        String response = scanner.nextLine();
        if (response.equals("YES")) {
            studentStorage.deleteStudentByEmail(currentStudent.getEmail());
        } else {
            userUI(currentStudent);
        }
    }

    private static void editMyAccount(Student currentStudent) {
        System.out.println("please input student's new name");
        String name = scanner.nextLine();
        System.out.println("please input student's new surname");
        String surname = scanner.nextLine();
        System.out.println("please input student's new age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input student's new phone");
        String phone = scanner.nextLine();
        System.out.println("Pleas input new Login");
        String login = scanner.nextLine();
        System.out.println("Please input new Password");
        String password = scanner.nextLine();
        System.out.println("please input student's lesson new names");
        String nameOfLessons = scanner.nextLine();


        currentStudent.setName(name);
        currentStudent.setSurname(surname);
        currentStudent.setAge(age);
        currentStudent.setPhone(phone);
        currentStudent.setLogin(login);
        currentStudent.setPassword(password);
        currentStudent.setDate(DateUtil.printMyTime(new Date()));

        System.out.println("Student updated!!!");

    }


    static void loginApp() {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
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
            // studentStorage.printStudentByLesson(name);
        } else {
            System.err.println("wrong lesson name");
        }

    }


    private static void addStudent()  {
        try {
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
            System.out.println("Pleas input Login");
            String login = scanner.nextLine();
            System.out.println("Please input Password");
            String password = scanner.nextLine();
            System.out.println("please input student's lesson names");
            String nameOfLessons = scanner.nextLine();


            if (studentStorage.getByEmail(email) == null) {
                String[] names = nameOfLessons.split(",");
                Lesson[] lessons = new Lesson[names.length];
                for (int i = 0; i < lessons.length; i++) {
                    if (lessonStorage.getLessonByName(names[i]) == null) {
                        System.out.println("Lesson with that name is not exist");
                    } else {
                        lessons[i] = lessonStorage.getLessonByName(names[i]);
                    }
                }
                Student student = new Student(name, surname, age, email, phone, lessons, DateUtil.printMyTime(new Date()), login, password);
                studentStorage.add(student);
                System.out.println("student added");
            } else {
                System.out.println("student with this email already exist");

            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();

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


}

