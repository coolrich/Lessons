package lesson8.exercise1;

public class Phone {
    private String number;
    private String model;
    private float weight;
    private static int count = 0;

    public Phone() {
        count++;
    }

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(float weight) {
        this.weight = weight;
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

    public void sendMessage(String... phoneNumbers) {
        for (String name : phoneNumbers) {
            System.out.println("Message has been sent to " + name);

        }
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is calling\n" + callerNumber);
    }

    public static int getCount() {
        return count;
    }

    @Override
    protected void finalize() {
        System.out.println("The phone " + getNumber() + "is deleted. " + "There are " + getCount());
    }
}

class PhoneDemo {

    public static void main(String[] args) {

        Phone[] all = new Phone[3];

        all[0] = new Phone();
        all[1] = new Phone("0985462133", "AA");
        all[2] = new Phone("0968524147", "A", 12);

        for (Phone p : all) {
            System.out.println(p.getModel() + " " + p.getNumber() + " " + p.getWeight());
            p.receiveCall("Someone", "0964568987");
            System.out.println("\n");
        }
        all[0].sendMessage("0964848488", "0964521321", "0964562121");
        all[0] = all[1] = all[2] = null;
        System.gc();
    }
}