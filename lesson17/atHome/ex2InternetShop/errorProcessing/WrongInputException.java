package lesson17.atHome.ex2InternetShop.errorProcessing;

public class WrongInputException extends Exception {
    public WrongInputException(String mess){
        super(mess);
    }
}
