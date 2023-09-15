public class HomeAppliance {

    public HomeAppliance[] appliances;
    private String name;
    private double I; // сила тока
    private double U; // напряжение
    private int count;

    public HomeAppliance(String name, double I, double U) {
        this.name = name;
        this.I = I;
        this.U = U;
    }
    public HomeAppliance(int capacity) {
        appliances = new HomeAppliance[capacity];
        count = 0;
    }

    public void addAppliance(HomeAppliance appliance) {
        if (count < appliances.length) {
            appliances[count++] = appliance;
        } else {
            System.out.println("Нет места для добавления прибора.");
        }
    }



    public String getName() {
        return name;
    }

    public double getI() {
        return I;
    }

    public double getPower() {
        return I * U;
    }


    public void findKitchenApplianceByI(double minI, double maxI) {
        System.out.println("Кухонные приборы в диапазоне тока от " + minI + "  до " + maxI + " :");

        for (int i = 0; i < appliances.length; i++) {
            if (appliances[i] instanceof KitchenAppliance) {
                double power = appliances[i].getI();
                if (power >= minI && power <= maxI) {
                    System.out.println(appliances[i].getName());
                }
            }
        }
    }

    public void turnOn() {
        System.out.println("Включен: " + getName());

    }

    public void turnOff() {
        System.out.println("Выключен: " + getName());

    }

    public void bubbleSortByI() {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < count - 1; i++) {
                if (appliances[i].getI() > appliances[i + 1].getI()) {
                    HomeAppliance temp = appliances[i];
                    appliances[i] = appliances[i + 1];
                    appliances[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);


        for (int i = 0; i < count; i++) {
            System.out.println(appliances[i].getName() + " - Сила тока: " + appliances[i].getI());
        }
    }

    public double calculateTotalPowerConsumption() {
        double totalPower = 0;
        for (HomeAppliance appliance : appliances) {
            if (appliance != null) {
                totalPower += appliance.getPower();
            }
        }
        return totalPower;
    }

}
