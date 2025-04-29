import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Service> serviceList;
    private double Total_Amount;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.serviceList = new ArrayList<>();
        this.Total_Amount = 0;
    }

    public void addService(Service service){
        serviceList.add(service);
        Total_Amount+=service.getPrice();
    }
    public void PrintInvoice(){
        System.out.println("----------------Invoice---------------");
        System.out.println("---------------Jai Jagdamba Service Center------------");
        System.out.println("Name: "+customer.getName()+" | Phone No.: "+customer.getMobile_Number());
        System.out.println("Car No.: "+customer.getCar().getCar_Number()+" | Car Details: "+customer.getCar().getModel());
        System.out.println("Service Done: ");
        for(Service service:serviceList){
            System.out.println("# "+service.getName()+" Rs."+service.getPrice());
        }
        System.out.println("Total Amount: "+Total_Amount);
        System.out.println("--------Thanks For Visiting Us-----------");



    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Service> getService() {
        return serviceList;
    }

    public double getTotal_Amount() {
        return Total_Amount;
    }
}
