package lesson10.ex4;

/**
 * Created by Student on 24.01.2018.
 */
interface Wrapple {
    void toWrap();
}

public abstract class Box implements Wrapple {
    private Wrapple wrapple;

    Box(Wrapple w) {
        wrapple = w;
    }

    public void toWrap() {
    }

    public void toGive() {
    }
}

class CelebrateBox extends Box {
    public CelebrateBox(Wrapple w) {
        super(w);
    }

    public void toWrap() {
        System.out.println("Celebrate wrapping");
    }

    public void toGive() {
        System.out.println("Celebrate giving");
    }

}
class UsuallBox extends Box {

    public UsuallBox(Wrapple w) {
        super(w);
    }

    public void toWrap() {
        System.out.println("Celebrate wrapping");
    }

    public void toGive() {
        System.out.println("Celebrate giving");
    }

}