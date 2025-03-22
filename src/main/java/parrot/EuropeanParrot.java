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

    double getBaseSpeed() {
        return 12.0;
    }
}
