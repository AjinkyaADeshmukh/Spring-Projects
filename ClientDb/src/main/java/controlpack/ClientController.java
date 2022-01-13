package controlpack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import daopack.StudentDao;
import pojopack.StudentPojo;

@RestController
@RequestMapping(path="/student")
public class ClientController {
	@Autowired
	StudentDao dao;
	
	@PostMapping(path="/insertS")
	public void getStudentdetails(@RequestBody StudentPojo sp) {
		dao.addStudent(sp.getId(), sp.getFname(), sp.getLname());
	}
	
	
}
