import java.util.*;
public class GarageService {
    private Map<String, Customer> customersMap;
    private List<Service> availableService;

    public GarageService() {
        this.customersMap = new HashMap<>();
        this.availableService = new ArrayList<>();
        loadService();

    }
    public void loadService(){
        availableService.add(new Service("Oil change: ", 700));
        availableService.add(new Service("Tyre Replacement: ", 5000));
        availableService.add(new Service("Puncture: ", 50));
        availableService.add(new Service("AC Filter ", 500));
        availableService.add(new Service("Wheel Alignment: ", 300));
    }

    public void addCustomer(String name, String Phone_Number, String CarNumber, String Model) {
        Car car = new Car(CarNumber, Model);
        Customer customer = new Customer(name, Phone_Number, car);
        customersMap.put(CarNumber, customer);

    }
    public void createInvoice(String CarNumber){
        if(!(customersMap.containsKey(CarNumber))){
            System.out.println("No car found with the number: "+CarNumber);
            return;
        }
        Scanner sc = new Scanner(System.in);
        Customer customer = customersMap.get(CarNumber);
        Invoice invoice = new Invoice(customer);

        System.out.println("Available Services");
        for(int i=0;i<availableService.size();i++){
            System.out.println((i+1)+". "+availableService.get(i).getName()+" "+availableService.get(i).getPrice());
        }
        while(true){
            System.out.println("Enter service number to add");
            int choice = sc.nextInt();
            if(choice==0)break;
            if(choice>0 && choice<=availableService.size()){
                invoice.addService(availableService.get(choice-1));
                System.out.println("Service Done");
            }
            else System.out.println("Invalid Choice");
        }
        invoice.PrintInvoice();

    }

}
