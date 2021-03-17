package au.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class AdminController {
	
	Logger logger = LoggerFactory.getLogger(AdminController.class);

	
	@GetMapping(value = "/application")
	@ResponseBody
	public ResponseEntity<?> getApplication() {
		
		System.out.println("Inside the getApplication");

	}	
	
	
}
