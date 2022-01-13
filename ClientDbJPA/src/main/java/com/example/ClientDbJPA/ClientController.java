package com.example.ClientDbJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
//@RequestMapping(path="/student")
public class ClientController {
	@Autowired
	StudentDao dao;
	
	@RequestMapping(method= RequestMethod.GET, path="/hello321")
	public String heel() {
		
		return "first";
	}
	
//	@PostMapping(path="/insertS/{id}/{fname}/{lname}")
//	public void getStudentdetails(@PathVariable int id, @PathVariable String fname, @PathVariable String lname) {
//		dao.addStudent(id, fname, lname);
//		
//	}
//	
	
}
