import Interfaces.Smartphones;
import Interfaces.IOS;

public class IPhones implements Smartphones, IOS {

    private String name;

    public IPhones(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void call() {
        System.out.println("Can call");
    }

    @Override
    public void sms() {
        System.out.println("Can send sms");
    }

    @Override
    public void internet() {
        System.out.println("Use Internet");

    }

    @Override
    public void operationSystemIOS() {
        System.out.println("OS - iOS");
    }
}
