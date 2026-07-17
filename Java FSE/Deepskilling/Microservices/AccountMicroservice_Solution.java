/*
QUESTION:
Microservices Account Service
Create Spring Boot REST microservice to fetch account details.
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/accounts")
public class AccountMicroservice_Solution {
    @GetMapping("/{id}")
    public String getAccount(@PathVariable String id) {
        return "Account ID: " + id + ", Balance: $5000";
    }
    public static void main(String[] args) {
        SpringApplication.run(AccountMicroservice_Solution.class, args);
    }
}
