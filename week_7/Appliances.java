public abstract class Appliances {
    protected String brand;

    public Appliances(String brand) {
        this.brand = brand;
    }

    public void turnOn()  { System.out.println("Power ON");  }
    public void turnOff() { System.out.println("Power OFF"); }
    public void displayBrand() { System.out.println("Brand : " + brand); }

    public abstract void operate();
}

class WashingMachine extends Appliances {
    public WashingMachine(String brand) { super(brand); }
    public void operate() { System.out.println("Washing clothes..."); }
}

class Refrigerator extends Appliances {
    public Refrigerator(String brand) { super(brand); }
    public void operate() { System.out.println("Store food & beverages..."); }
}
