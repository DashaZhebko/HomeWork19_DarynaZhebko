import Interfaces.IOS;

public class HomeWork19 {
    public static void main(String[] args) {
        Androids samsung = new Androids("Samsung C23 ultra");
        System.out.println(samsung.getName() + " characteristics:");
        samsung.call();
        samsung.internet();
        samsung.sms();
        samsung.operationSystemLinux();


        IPhones iphone = new IPhones("iPhone 13Pro Max");
        System.out.println(iphone.getName() + " characteristics:");
        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.operationSystemIOS();
    }
}
