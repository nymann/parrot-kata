package parrot;

public class ParrotFactory {
    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
            case AFRICAN -> new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE -> new NorwegianParrot(voltage, isNailed);
        };
    }
}