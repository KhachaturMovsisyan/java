package experiments.shop;

import homework.author.Author;

public class UserStorage {
    private User[] array = new User[10];
    private int size = 0;

    public void add(User user) {

        if (size == array.length) {
            extend();
        }
        array[size++] = user;
    }

    private void extend() {
        User[] newArray = new User[array.length + 10];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public User getByIndex(int index) {
        if (index < array.length) {

            return array[index];
        } else {
            System.out.println("User not found");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }

    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)){

                return array[i];
            }
        }
        return null;
    }

    public void chech(String login, String password) {
        for (int i = 0; i < size; i++) {
          //  if (array[i].getLogin().equals(login) && array[i].getPassword(password));
        }
    }
}
