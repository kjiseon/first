package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {

	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("/getAll")
	public List<Person> getAll() {
		return (List<Person>) personRepository.findAll();
	}
	
}
