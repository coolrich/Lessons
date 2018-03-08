package lesson18.atHome.e6InternetShopWithReport.errorProcessing;

public class WrongInputException extends Exception {
    public WrongInputException(String mess) {
        super(mess);
    }
}
