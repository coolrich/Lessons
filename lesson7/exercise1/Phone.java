package lesson7.exercise1;

public class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone() {

    }

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String...phoneNumbers){
        for (String name:
             phoneNumbers) {
            System.out.println("Message has been sent to "+name);

        }
    }
    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is calling\n" +callerNumber);
    }

}

class honeDemo {

    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone("0985462133", "AA");
        Phone p3 = new Phone("0968524147", "A", 12);

        Phone[] all = new Phone[3];
        all[0] = p1;
        all[1] = p2;
        all[2] = p3;

        for (Phone p :
                all) {
            System.out.println(p.getModel() + " " + p.getNumber() + " " + p.getWeight());
            p.getNumber();
            p.receiveCall("Someone","0964568987");
            System.out.println("\n");
        }
        all[0].sendMessage("0964848488","0964521321","0964562121");
    }
}