package deployment.aks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AksApplication {

	public static void main(String[] args) {
		SpringApplication.run(AksApplication.class, args);

	}
	@GetMapping("/hey")
    public String hello() {
        return "Hello, Azure AKS!";

}
}
