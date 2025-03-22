package parrot;

public abstract class Parrot {

    protected final ParrotTypeEnum type;
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
            case AFRICAN -> new AfricanParrot(numberOfCoconuts, voltage, isNailed);
            case NORWEGIAN_BLUE -> new NorwegianParrot(numberOfCoconuts, voltage, isNailed);
        };
    }

    public abstract double getSpeed();
    public abstract String getCry();

}
