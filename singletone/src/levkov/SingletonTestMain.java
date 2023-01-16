package levkov;

public class SingletonTestMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("One!");
        Singleton singleton2 = Singleton.getInstance("Two");


        System.out.println(singleton1 == singleton2);

        System.out.println(singleton1.getValue());
        System.out.println(singleton2.getValue());
    }
}
