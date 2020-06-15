package com.spring.boot.rocks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.rocks.model.Employee;
import com.spring.boot.rocks.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/")
	public String indexPage(Model model) {
		return "index";
	}

	 @RequestMapping(value = "saveEmployee", method = RequestMethod.POST)
	   public String saveUser(@RequestBody Employee employee) {

		 System.out.println(">>>>>>>>>>>         " + employee.getId());
		 System.out.println(">>>>>>>>>>>         " + employee.getName());
		 System.out.println(">>>>>>>>>>>         " + employee.getEmail());
		 System.out.println(">>>>>>>>>>>         " + employee.getHobbies());
		 System.out.println(">>>>>>>>>>>         " + employee.getSpecialization());
		 System.out.println(">>>>>>>>>>>         " + employee.getGender());
		 System.out.println(">>>>>>>>>>>         " + employee.getNationality());
		 
		 System.out.println(employee);
		 
		 
		 employeeRepository.save(employee);
		 
		 return "index";
	   }

}
