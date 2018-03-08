package lesson20.atHome.e2;

import java.io.*;

public class SerializeInternetShop {
    public void saveState(InternetShop is) {
        try (FileOutputStream fs = new FileOutputStream("lesson19/atHome/e2/saveStates/saves.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)
        ) {
            os.writeObject(is);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public InternetShop loadState() {
        InternetShop is = null;
        try (FileInputStream fis = new FileInputStream("lesson19/atHome/e2/saveStates/saves.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            is = (InternetShop) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return is;
    }
}
