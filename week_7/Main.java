public class Main {
    public static void main(String[] args) {

        WashingMachine w = new WashingMachine("LG");
        w.displayBrand();
        w.turnOn();
        w.operate();
        w.turnOff();

        System.out.println();

        Refrigerator r = new Refrigerator("Panasonic");
        r.displayBrand();
        r.turnOn();
        r.operate();
        r.turnOff();
    }
}
