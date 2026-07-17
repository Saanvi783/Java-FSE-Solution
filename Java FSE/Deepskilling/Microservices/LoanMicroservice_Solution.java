/*
QUESTION:
Microservices Loan Service
Create Spring Boot REST microservice to fetch loan account details.
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/loans")
public class LoanMicroservice_Solution {
    @GetMapping("/{id}")
    public String getLoan(@PathVariable String id) {
        return "Loan Account ID: " + id + ", Due: $1000";
    }
    public static void main(String[] args) {
        SpringApplication.run(LoanMicroservice_Solution.class, args);
    }
}
