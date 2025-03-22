package parrot;

public class AfricanParrot extends Parrot {
    public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, voltage, isNailed);
    }

    public String getCry() {
        return "Sqaark!";
    }

    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    double getLoadFactor() {
        return 9.0;
    }

    double getBaseSpeed() {
        return 12.0;
    }
}
