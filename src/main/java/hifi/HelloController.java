package hifi;

import hifi.mapper.HrMapper;
import hifi.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {
	@GetMapping ("/hello") 
	public String hello () {
		return "hello spring boot !";
	}

	@GetMapping ("/hrlist")
	public String hrlist () {
		return "";
	}
}
