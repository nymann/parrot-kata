package parrot;

public class AfricanParrot implements Parrot {
    protected final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
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
