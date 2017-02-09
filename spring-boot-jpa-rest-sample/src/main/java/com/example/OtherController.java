package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class OtherController {

	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Person> getAll() {
		return (List<Person>) personRepository.findAll();
	}
	
}
