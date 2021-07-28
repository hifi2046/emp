package hifi;

import hifi.mapper.HrMapper;
import hifi.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Slf4j
@RestController
public class HelloController {
	@Autowired
	HrService hrs;

	@GetMapping ("/hello") 
	public String hello () {
		log.info("hello");
		return "hello spring boot !";
	}

	@GetMapping ("/hrlist")
	public String hrlist () {
		log.info("hrlist");
		return hrs.hr();
	}
}
