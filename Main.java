public class Main {
    public static void main(String[] args) {

        HomeAppliance manager = new HomeAppliance(7);
        manager.addAppliance(new Fan("Philips Air-Water Cooling Fan ACR3144T", 5.3, 10.2, -12));
        manager.addAppliance(new VacuumCleaner("Xiaomi Vacuum Cleaner G11 ", 2.1, 5, 80, 4));
        manager.addAppliance(new WashingMachine("Samsung DV90T5240AT/LP", 4.4, 10.1, 54, 15));
        manager.addAppliance(new Mixer("Hyundai HYM-S6451", 3, 4.2));
        manager.addAppliance(new Refrigerator("Snaige FR27SM-PRDL0E", 4.1, 4));
        manager.addAppliance(new Kettle("Bork K515", 1, 9));
        manager.addAppliance(new Kettle("Bork K514", 2, 9));
        System.out.println("Техника отсортированная по силе тока: ");
        manager.bubbleSortByI();
        System.out.println("\n");

        System.out.println("Включенные и выключенные приборы: ");
        Refrigerator refrigerator = (Refrigerator) manager.appliances[4];
        refrigerator.turnOn();
        Mixer mixer = (Mixer) manager.appliances[3];
        mixer.turnOff();
        System.out.println("\n");

        double minI = 2;
        double maxI = 4;

        manager.findKitchenApplianceByI(minI, maxI);


        System.out.println("\nОбщая потребляемая мощность: " + manager.calculateTotalPowerConsumption() + " Вт");

    }
}

