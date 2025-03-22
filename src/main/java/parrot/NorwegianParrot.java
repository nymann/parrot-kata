package parrot;

public class NorwegianParrot extends Parrot {
    public NorwegianParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(ParrotTypeEnum.NORWEGIAN_BLUE, numberOfCoconuts, voltage, isNailed);
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

    double getLoadFactor() {
        return 9.0;
    }

    double getBaseSpeed() {
        return 12.0;
    }
}
