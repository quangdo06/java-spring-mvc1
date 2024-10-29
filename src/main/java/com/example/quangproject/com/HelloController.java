package com.example.quangproject.com;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
	@GetMapping("/quang1")
	public String index() {
		return "XIN CHAO DO HONG QUANG test git";
	}
	
}
