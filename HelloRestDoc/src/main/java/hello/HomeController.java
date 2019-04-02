package hello;

import java.util.Map;
import java.util.Collections;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

	@GetMapping("/")
	public Map<String, Object> greeting() {
		return Collections.singletonMap("message", "Hello World!");
	}

}