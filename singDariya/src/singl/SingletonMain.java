package singl;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Here if you see two same words sing was reused " + "\n" +
                "Here if you see two different words sing was creaed " + "\n" +
                "RESULT:" + " ");

        Singleton singleton1 = Singleton.getInstance("reused");
        Singleton singleton2 = Singleton.getInstance("created");
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);

    }}


