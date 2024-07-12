package creational.design.patterns;

public class Singleton {
    private Singleton() {}

    private static final class InstanceHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return InstanceHolder.instance;
    }
    public String getData() {
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().getData());
    }
}
