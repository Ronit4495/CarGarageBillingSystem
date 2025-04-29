public class Service {
    private String Name;
    private double price;

    public Service(String name, double price) {
        this.Name = name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }
}
