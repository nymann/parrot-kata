package parrot;

public class AfricanParrot extends Parrot {
    public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, voltage, isNailed);
    }

    public String getCry() {
        return switch (ParrotTypeEnum.AFRICAN) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }

    public double getSpeed() {
        return switch (ParrotTypeEnum.AFRICAN) {
            case EUROPEAN -> getBaseSpeed();
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
        };
    }
}
