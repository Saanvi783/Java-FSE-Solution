/*
QUESTION:
Implementing Dependency Injection
Scenario: Dependency Injection for CustomerRepository into CustomerService.
*/

interface CustomerRepository { String findCustomer(int id); }
class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomer(int id) { return "Customer #" + id; }
}
class CustomerService {
    private CustomerRepository repo;
    public CustomerService(CustomerRepository repo) { this.repo = repo; }
    public void getCustomerDetails(int id) { System.out.println("Found: " + repo.findCustomer(id)); }
}
public class Exercise11_DependencyInjection_Solution {
    public static void main(String[] args) {
        CustomerService service = new CustomerService(new CustomerRepositoryImpl());
        service.getCustomerDetails(101);
    }
}
