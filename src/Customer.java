public class Customer {
    private String name;
    private String Mobile_Number;
    private Car car;

    public Customer(String name, String mobile_Number, Car car) {
        this.name = name;
        this.Mobile_Number = mobile_Number;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getMobile_Number() {
        return Mobile_Number;
    }

    public Car getCar() {
        return car;
    }
}
