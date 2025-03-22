package parrot;

public class NorwegianParrot implements Parrot {
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    public NorwegianParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }

    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    double getBaseSpeed() {
        return 12.0;
    }
}
