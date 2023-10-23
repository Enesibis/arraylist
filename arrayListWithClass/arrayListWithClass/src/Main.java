import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer enes = new Customer(1,"Enes","İbiş");
        customers.add(enes);
        customers.add(new Customer(1,"Recep","Efe"));
        customers.add(new Customer(1,"Melisa","Yemişçi"));

        customers.remove(enes);

        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }

    }
}