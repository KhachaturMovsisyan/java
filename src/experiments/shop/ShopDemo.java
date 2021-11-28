package experiments.shop;

import homework.author.Author;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class ShopDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductStorage productStorage = new ProductStorage();
    private static UserStorage userStorage = new UserStorage();

    // Main menu constants
    private static final String EXIT = "0";
    private static final String LOGIN = "1";
    private static final String REGISTRATION = "2";

    // user menu constants
    private static final String BACK = "0";
    private static final String EDIT_USER = "1";
    private static final String ADD_BALANCE = "2";
    private static final String BUY_PRODUCT = "3";



    public static void main(String[] args) {

        boolean isrun=true;

        while (isrun){
            printCommand();
            String comand=scanner.nextLine();
            switch (comand){
                case EXIT:
                    isrun=false;
                    break;
                case LOGIN:
                    loginInterface();
                    break;
                case REGISTRATION:
                    registration();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }



    }

    private static void registration() {
        System.out.println("please input your name");
        String name = scanner.nextLine();

        System.out.println("please input your surname");
        String surname = scanner.nextLine();

        System.out.println("please input your email");
        String email = scanner.nextLine();

        System.out.println("please input your gender");
        String gender = scanner.nextLine();

        System.out.println("please input your age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please input your password");
        String password = scanner.nextLine();

        System.out.println("please input your login");
        String login = scanner.nextLine();



        User user = new User(name,surname,age,gender,email,password,login);
        if (userStorage.getByEmail(user.getEmail()) != null) {
            System.err.println("Invalid email. Author with this email already exists");
        } else {
            userStorage.add(user);
            System.out.println("Congratulations ! You are registered in our shop");
        }

    }


    private static void loginInterface() {
        System.out.println("please input your login");
        String login = scanner.nextLine();

        System.out.println("please input your password");
        String password = scanner.nextLine();

        if(login.equals("Admin") && password.equals("Admin")){
            adminInterface();
        }
        else {
            userInterface(login,password);
        }
    }

    private static void userInterface(String login, String password) {
        if(userStorage.check(login,password)!=null){
            userCommands();
            boolean isRun = true;
            String userComand = scanner.nextLine();
            while (isRun){
                switch (userComand){
                    case BACK:
                        isRun=false;
                        break;
                    case EDIT_USER:
                        editUser(userStorage.check(login,password));
                        break;
                    case ADD_BALANCE:
                        addBalance(userStorage.check(login,password));
                        break;
                    case BUY_PRODUCT:
                        buyProduct();

                        break;
                    default:
                        System.out.println("Invalid Command");


                }
            }
        }
        else {
            System.out.println("Wrong email or password !!!");
            loginInterface();
        }

    }

    private static void buyProduct() {
    }

    private static void addBalance(User check) {
        System.out.println("Type your money");
        double payment = Double.parseDouble(scanner.nextLine());
        userStorage.payment(check,payment);
    }

    private static void editUser(User check) {

    }

    private static void userCommands() {
        System.out.println("Please Input " + BACK + "for BACK");
        System.out.println("Please Input " + EDIT_USER +" for edit your accaunt");
        System.out.println("Please Input " + ADD_BALANCE +" for ADD BALANCE your accaunt");
        System.out.println("Please Input " + BUY_PRODUCT +" for BUY PRODUCT");

    }

    private static void adminInterface() {

    }

    private static void printCommand() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOGIN + " for LOGIN");
        System.out.println("Please input " + REGISTRATION + " for REGISTRATION");


    }


}
