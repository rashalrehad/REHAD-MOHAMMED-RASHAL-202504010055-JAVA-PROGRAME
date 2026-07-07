public abstract class Appliances {

    protected String brand;

    public Appliances(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand : " + brand);
    }

    public void turnOn() {
        System.out.println("Power ON");
    }

    public void turnOff() {
        System.out.println("Power OFF");
    }

    // Abstract method - each appliance must define its own operate behaviour
    public abstract void operate();


    // ── Concrete class 1: Washing Machine ──────────────────────────────────
    static class WashingMachine extends Appliances {

        public WashingMachine(String brand) {
            super(brand);
        }

        @Override
        public void operate() {
            System.out.println("Washing clothes...");
        }
    }


    // ── Concrete class 2: Refrigerator ─────────────────────────────────────
    static class Refrigerator extends Appliances {

        public Refrigerator(String brand) {
            super(brand);
        }

        @Override
        public void operate() {
            System.out.println("Store food & beverages...");
        }
    }


    // ── Extra class 3: Air Conditioner ─────────────────────────────────────
    static class AirConditioner extends Appliances {

        public AirConditioner(String brand) {
            super(brand);
        }

        @Override
        public void operate() {
            System.out.println("Cooling the room...");
        }
    }


    // ── Extra class 4: Microwave ───────────────────────────────────────────
    static class Microwave extends Appliances {

        public Microwave(String brand) {
            super(brand);
        }

        @Override
        public void operate() {
            System.out.println("Heating food...");
        }
    }
}
