public class CleaningAppliance extends HomeAppliance {

    private final int noiseLevel;

    public CleaningAppliance(String name, double I, double U, int noiseLevel) {
        super(name, I, U);
        this.noiseLevel = noiseLevel;
    }

    public int getNoiseLevel() {
        return noiseLevel;
    }

}
