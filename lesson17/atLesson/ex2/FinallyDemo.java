package lesson17.atLesson.ex2;

/**
 * Created by Student on 21.02.2018.
 */
public class FinallyDemo {
    public static void main(String[] args) {
        isAuthenticated("jkhsd", "afsa", "afsa");
    }

    public static boolean isAuthenticated(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login is incorrect!");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Password is incorrect");
            }
            return true;
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.printf("Login %s, password %s, conf passwd %s",login,password,confPassword);
        }
        return true;
    }
}
