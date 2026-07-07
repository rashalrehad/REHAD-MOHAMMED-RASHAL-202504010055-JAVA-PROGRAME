public class Main {

    public static void main(String[] args) {

        // Appliance 1 - Washing Machine (LG)
        Appliances washer = new Appliances.WashingMachine("LG");
        washer.displayBrand();
        washer.turnOn();
        washer.operate();
        washer.turnOff();

        System.out.println();

        // Appliance 2 - Refrigerator (Panasonic)
        Appliances fridge = new Appliances.Refrigerator("Panasonic");
        fridge.displayBrand();
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();

        System.out.println();

        // Extra Appliance 3 - Air Conditioner (Daikin)
        Appliances ac = new Appliances.AirConditioner("Daikin");
        ac.displayBrand();
        ac.turnOn();
        ac.operate();
        ac.turnOff();

        System.out.println();

        // Extra Appliance 4 - Microwave (Samsung)
        Appliances microwave = new Appliances.Microwave("Samsung");
        microwave.displayBrand();
        microwave.turnOn();
        microwave.operate();
        microwave.turnOff();
    }
}
