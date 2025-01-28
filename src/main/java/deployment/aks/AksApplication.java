package deployment.aks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AksApplication {

	public static void main(String[] args) {
		SpringApplication.run(AksApplication.class, args);

	}
	@GetMapping("/")
    public String hello() {
        return "Hello, Azure AKS!";

}
}
