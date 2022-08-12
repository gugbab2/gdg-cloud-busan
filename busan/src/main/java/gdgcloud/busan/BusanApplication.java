package gdgcloud.busan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BusanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusanApplication.class, args);
	}

}

@RestController
class HelloGDG {
	@GetMapping("/")
	public String defaultController(){
		return "HELLO GDG-CLOUD_BUSAN!";
	}
}
