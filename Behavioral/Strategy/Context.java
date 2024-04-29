package Behavioral.Strategy;

public class Context {
    private Strategy strategy;

    void setStrategry(Strategy s) {
        this.strategy = s;
    }
    void execute(int a, int b) {
        int result = this.strategy.execute(a, b);
        System.out.println(result);
    }
}
