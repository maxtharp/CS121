package Activity36;
import java.util.ArrayList;
import java.util.Scanner;
public class CustomerRecord {
    StringBuilder stringBuilder = new StringBuilder();
    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addCustomer(){
        System.out.println("First Name: ");
        String firstName = scanner.next();
        System.out.println("Last Name: ");
        String lastName = scanner.next();
        System.out.println("Phone: ");
        String phone = scanner.next();
        System.out.println("Email: ");
        String email = scanner.next();
        System.out.println("License: ");
        String license = scanner.next();
        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.next());

        Customer customer = new Customer(firstName, lastName, phone, email, license, age);
        arrayList.add(customer.getCustomerInfo());
    }
    public void getAllCustomers(){
        for(String customer : arrayList){
            stringBuilder.append(customer);
        }
        System.out.println(stringBuilder);
    }
}
