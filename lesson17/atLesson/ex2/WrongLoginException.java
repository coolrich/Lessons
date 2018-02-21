package lesson17.atLesson.ex2;

/**
 * Created by Student on 21.02.2018.
 */
public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
    public WrongLoginException(){

    }
    @Override
    public String toString(){
        return "WrongLoginException{} " + super.toString();
    }

}
