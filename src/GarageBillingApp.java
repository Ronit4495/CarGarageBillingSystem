import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageService garage = new GarageService();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------Jai Jagdamba Bus Service Center------------");
        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. Display Service");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter Customer Name: ");
                    String name = sc.next();
                    System.out.println("Enter Customer Phone No.: ");
                    String number = sc.next();
                    System.out.println("Enter Car Number: ");
                    String Cnum = sc.next();
                    System.out.println("Enter Car Model: ");
                    String Cmodel = sc.next();
                    garage.addCustomer(name, number,Cnum,Cmodel);
                    System.out.println("Customer Added successfullly");
                    break;
                case 2:
                    System.out.println("Enter Car Number");
                    String Cnumber = sc.next();
                    garage.createInvoice(Cnumber);
                    break;
                case 3:
                    System.out.println("Thanks for Visiting us");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice . Try again");
            }
        }
    }
}
