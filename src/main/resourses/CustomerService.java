import java.util.List;

public class CustomerService {

    private CustomerDao customerDao = new CustomerDao();

    public CustomerService() {
    }

    public Customer findUser(int id) {
        return customerDao.findById(id);
    }

    public void saveCustomer(Customer customer) {
        customerDao.save(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerDao.delete(customer);
    }

    public void updateCustomer(Customer customer) {
        customerDao.update(customer);
    }

    public List<Customer> findAllCustomer() {
        return customerDao.findAll();
    }

    public Auto findAutoById(int id) {
        return customerDao.findAutoById(id);
    }


}

