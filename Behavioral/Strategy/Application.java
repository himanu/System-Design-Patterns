package Behavioral.Strategy;

public class Application {
    public static void main(String[] args) {
        Strategy s = new AdditionStrategy();
        Context context = new Context();
        context.setStrategry(s);
        context.execute(10, 12);
    }
}
