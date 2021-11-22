package homework.author;

import java.util.Scanner;

public class AuthorBookTest {

    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHOR = "3";
    private static final String SEARCH_AUTHOR_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";

    public static void main(String[] args) {

        authorStorage.add(new Author("Hovhannes", "Tumanyan", "hovhannes@mail.com", 88, "male"));
        authorStorage.add(new Author("Derenik", "Demirjyan", "derenik@mail.com", 55, "male"));
        authorStorage.add(new Author("Avetiq", "Isahakyan", "avetiq@mail.com", 66, "male"));
        bookStorage.add(new Book("Vernagir", "nkaragrutyun", 5514, 5,authorStorage.getByIndex(0) ));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHOR:
                    searchAuthor();
                    break;
                case SEARCH_AUTHOR_BY_AGE:
                    searchAuthorByAge();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                default:
                    System.out.println("invalid command!");
            }

        }
    }

    private static void changeAuthor() {
        System.out.println("please choose author's email");
        String email = scanner.nextLine();
        Author author  = authorStorage.getByEmail(email);
        if (author!=null) {
            System.out.println("please input author's name");
            String name = scanner.nextLine();

            System.out.println("please input author's surname");
            String surname = scanner.nextLine();

            System.out.println("please input author's gender");
            String gender = scanner.nextLine();

            System.out.println("please input author's age");
            int age = Integer.parseInt(scanner.nextLine());
            authorStorage.editAuthor(author,name,surname,gender,age);
            System.out.println("Author was changed!!!!");

        }else {
            System.out.println("Invalid email try again");
            changeAuthor();
        }

    }

    private static void changeBookAuthor() {
        System.out.println("please choose book's title");
        String title = scanner.nextLine();
        if(bookStorage.getBookByTitle(title) != null){
            System.out.println("please choose author's email");
            String email = scanner.nextLine();
            bookStorage.getBookByTitle(title).setAuthor(authorStorage.getByEmail(email));
        }else {
            System.out.println("Invalid title, try again");
            changeBookAuthor();
        }

    }


    private static void countBooksByAuthor() {
        System.out.println("please choose author's email");
        String email = scanner.nextLine();
        bookStorage.countBooksByAuthor(authorStorage.getByEmail(email));
    }

    private static void searchBooksByAuthor() {
        System.out.println("please choose author's email");
        String email = scanner.nextLine();
        bookStorage.searchBooksByAuthor(email);
    }

    private static void searchBooksByTitle() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchBooksByTitle(keyword);
    }

    private static void addBook() {
        System.out.println("please choose author's email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);

        if (author != null) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, author);

            bookStorage.add(book);

            System.out.println("Thank you, Book was added");
        } else {
            System.out.println("invalid email! please try again");
            addBook();

        }
    }


    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("Please input " + ADD_BOOK + " for ADD_BOOK");
        System.out.println("Please input " + SEARCH_AUTHOR + " for SEARCH_AUTHOR");
        System.out.println("Please input " + SEARCH_AUTHOR_BY_AGE + " for SEARCH_AUTHOR_BY_AGE");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + " for SEARCH_BOOKS_BY_TITLE");
        System.out.println("Please input " + PRINT_AUTHORS + " for PRINT_AUTHORS");
        System.out.println("Please input " + PRINT_BOOKS + " for PRINT_BOOKS");
        System.out.println("Please input " + SEARCH_BOOKS_BY_AUTHOR + " for SEARCH_BOOKS_BY_AUTHOR");
        System.out.println("Please input " + COUNT_BOOKS_BY_AUTHOR + " for COUNT_BOOKS_BY_AUTHOR");
        System.out.println("Please input " + CHANGE_AUTHOR + " for CHANGE_AUTHOR");
        System.out.println("Please input " + CHANGE_BOOK_AUTHOR + " for CHANGE_BOOK_AUTHOR");
    }

    private static void searchAuthorByAge() {
        System.out.println("Please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchAuthorByAge(minAge, maxAge);
    }

    private static void searchAuthor() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchAuthor(keyword);
    }

    private static void addAuthor() {
        System.out.println("please input author's name");
        String name = scanner.nextLine();

        System.out.println("please input author's surname");
        String surname = scanner.nextLine();

        System.out.println("please input author's email");
        String email = scanner.nextLine();

        System.out.println("please input author's gender");
        String gender = scanner.nextLine();

        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, email, age, gender);
        if (authorStorage.getByEmail(author.getEmail()) != null) {
            System.err.println("Invalid email. Author with this email already exists");
        } else {
            authorStorage.add(author);
            System.out.println("Thank you! Author was added");
        }

    }


}