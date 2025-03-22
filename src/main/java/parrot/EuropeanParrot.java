package parrot;

public class EuropeanParrot implements Parrot {
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    public EuropeanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public String getCry() {
        return "Sqoork!";
    }

    public double getSpeed() {
        return getBaseSpeed();
    }

    double getBaseSpeed() {
        return 12.0;
    }
}
