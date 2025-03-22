package parrot;

public class AfricanParrot implements Parrot {
    protected final int numberOfCoconuts;
    protected final boolean isNailed;

    public AfricanParrot(int numberOfCoconuts, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.isNailed = isNailed;
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
