package com.spring.boot.rocks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.boot.rocks.model.DefectSeverityDetails;
import com.spring.boot.rocks.model.Developer;

@Controller
@RequestMapping(value = "/ajax")
public class AjaxHandlingController {

	@RequestMapping(value = "/getDefectCount", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody DefectSeverityDetails postEmployeeData(@RequestBody Developer developer) {

		// process the developer object
		// Your implementation. For demo hard-coded the Defect counts

		// On front end you entered these values:

		System.out.println(">>>>>>>>>>>       Developer ID - " + developer.getId());
		System.out.println(">>>>>>>>>>>       Developer FirstName - " + developer.getFirstName());
		System.out.println(">>>>>>>>>>>       Developer LastName - " + developer.getLastName());

		DefectSeverityDetails defectSeverityDetails = new DefectSeverityDetails();
		defectSeverityDetails.setHigh(3);
		defectSeverityDetails.setMedium(2);
		defectSeverityDetails.setLow(8);

		return defectSeverityDetails;
	}

	@RequestMapping(value = "/index2")
	public String showEmployeePage() {
		return "index2";
	}

}
