package parrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(ParrotTypeEnum.EUROPEAN, numberOfCoconuts, voltage, isNailed);
    }

    public String getCry() {
        return "Sqoork!";
    }

    public double getSpeed() {
        return getBaseSpeed();
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
