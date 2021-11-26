package experiments.shop;

import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private int age;
    private String gander;
    private String email;
    private String password;
    private String login;

    User(){

    }

    public User(String name, String surname, int age, String gander, String email, String password, String login) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gander = gander;
        this.email = email;
        this.password = password;
        this.login = login;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gander='" + gander + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && name.equals(user.name) && surname.equals(user.surname) && gander.equals(user.gander) && email.equals(user.email) && password.equals(user.password) && login.equals(user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gander, email, password, login);
    }
}

