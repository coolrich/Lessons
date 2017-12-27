package lesson7.exercise1;

public class Phone {
    public String number;
    public String model;
    public float weight;

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling");
    }

    public void receiveCall(String callerName,String callerNumber) {
        System.out.println(callerName + " is calling");
    }

    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();
        p1.weight = p2.weight = p3.weight = 100;
        p1.model = p2.model = p3.model = "TT";
        p1.number = "054644646";
        p2.number = "050144874";
        p3.number = "048785658";

        Phone[] all = new Phone[3];
        all[0] = p1;
        all[1] = p2;
        all[2] = p3;

        for (Phone p :
                all) {
            System.out.println(p.model + " " + p.number + " " + p.weight);
            p.getNumber();
            p.receiveCall("Someone");
        }
    }
}
