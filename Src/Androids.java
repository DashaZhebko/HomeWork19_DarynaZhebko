import Interfaces.LinuxOS;
import Interfaces.Smartphones;

public class Androids implements Smartphones, LinuxOS {

    private String name;

    public Androids(String name) {
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
        System.out.println("Send sms");
    }

    @Override
    public void internet() {
        System.out.println("Use Internet");
    }

    @Override
    public void operationSystemLinux() {
        System.out.println("OS - Linux");
    }
}
