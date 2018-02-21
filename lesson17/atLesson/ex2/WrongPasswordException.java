package lesson17.atLesson.ex2;

/**
 * Created by Student on 21.02.2018.
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
    public WrongPasswordException(){

    }
    @Override
    public String toString(){
        return "WrongPasswordException{} " + super.toString();
    }

}
