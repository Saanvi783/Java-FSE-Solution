/*
QUESTION:
Eureka Discovery Server
Create Eureka Discovery Server and register microservices.
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryServer_Solution {
    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoveryServer_Solution.class, args);
    }
}
