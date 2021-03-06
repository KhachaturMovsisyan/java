package homework.author.storage;

import homework.author.model.Author;
import homework.author.model.Book;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        } else {
            books[size] = book;
            size++;
        }
    }

    private void extend() {
        Book[] newBooks = new Book[books.length + 10];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        books = newBooks;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBooksByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBooksByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                System.out.println(books[i]);
            }
        }
    }

    public void countBooksByAuthor(Author author) {
        int countofAuthor = 0;
        for (int i = 0; i < size; i++) {

            if (books[i].getAuthor().equals(author)) {
                System.out.println("The count of " + books[i].getTitle() + " is " +
                        books[i].getCount());
                countofAuthor++;
            }

        }

        System.out.println(" The " + author.getName() + " " + author.getSurname() +
                " has a " + countofAuthor + " books");
    }


    public Book getBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteByAuthorBook(String email) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                index = i;


            }
        }

        for (int i =index; i < size; i++) {
            books[i] = books[i+1];
            size--;
        }

    }


    public void deleteBook(String title) {
        int index=0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)){
                index=i;
            }
        }
        for (int i = index; i <size; i++) {
            books[i]=books[i+i];
        }
        size--;
    }
}
