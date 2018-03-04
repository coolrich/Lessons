package lesson13.atLesson.ex3;

/**
 * Created by student on 04.02.2018.
 */
public class User1 {
    private String login;
    private String password;

    public User1(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {
        User1 user = new User1("Login", "pswd");
        user.createQuery("Address");

    }

    public void createQuery(String name) {
        class Query {
            public void printToLog() {
                System.out.printf("The user %s with psswd %s sent query %s%n", login, password, name);
            }
        }
        new Query().printToLog();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User1 user1 = (User1) o;

        if (getLogin() != null ? !getLogin().equals(user1.getLogin()) : user1.getLogin() != null) return false;
        return getPassword() != null ? getPassword().equals(user1.getPassword()) : user1.getPassword() == null;

    }

    @Override
    public int hashCode() {
        int result = getLogin() != null ? getLogin().hashCode() : 0;
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User1{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

