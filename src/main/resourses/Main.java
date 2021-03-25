import java.sql.SQLException;

public class Main {

        public static void main(String[] args) throws SQLException {

            CustomerService CustomerService = new CustomerService();
            Customer customer = new Customer("Lesha",30);
            CustomerService.saveCustomer(customer);
            Auto mercedes = new Auto("Mercedes", "black");
            mercedes.setCustomer(customer);
            customer.addAuto(mercedes);
            Auto bugatti = new Auto("Bugatti", "green");
            bugatti.setCustomer(customer);
            customer.addAuto(bugatti);
            CustomerService.updateCustomer(customer);
        }
}
