package hifi;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	@GetMapping ("/hello") 
	public String hello () {
		return "hello spring boot !";
	}
}
