public class WashingMachine extends CleaningAppliance {

    private final double maximumLoad;

    public WashingMachine(String name, double I, double U, int noiseLevel, double maximumLoad) {
        super(name, I, U, noiseLevel);
        this.maximumLoad = maximumLoad;
    }

    public double getMaximumLoad() {
        return maximumLoad;
    }

}
