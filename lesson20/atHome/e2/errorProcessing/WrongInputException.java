package lesson20.atHome.e2.errorProcessing;

public class WrongInputException extends Exception {
    public WrongInputException(String mess) {
        super(mess);
    }
}
