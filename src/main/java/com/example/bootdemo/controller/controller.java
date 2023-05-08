package com.example.bootdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.admin;
import com.example.bootdemo.dto.student;
import com.example.bootdemo.repositary.adminrepositary;
import com.example.bootdemo.repositary.studentrepositary;

@RestController
public class controller {
	
	@Autowired
	studentrepositary sr;
	
	@Autowired
	adminrepositary a1;
	
	
//	@PostMapping("/hi")//
//	public String m1() {
//		return "hello,good evening";
//	}
	//}

//	//@GetMapping("/hello")//
//	//public void m2() {
////		System.out.println( "get request is handled");
////	}
//	@PutMapping("/hola")
//	public String m3() {
//		return " bonjour";
//	}
////	@DeleteMapping("/bye")
//	public void m4() {
//		System.out.println( " request is handled");
//	}
	
	
	//@PostMapping("/savedata")
	//public String save(@RequestBody student s) {
//	sr.save(s);
	//	return "data saved";
	//}
	
//	@PostMapping("/dataadd")
//	public String save(@RequestBody admin a) {
//		a1.save(a);
//		return "data added sucessfully";
//	}
	@GetMapping("/fetchdata")
		public admin fetchadminById(@RequestParam int id) {
			Optional<admin>op=a1.findById(id);
		admin b=op.get();
		return b;
		}
	
	@GetMapping("/fetch1")
	public student fetchstudentById(@RequestParam int id) {
		Optional<student>op=sr.findById(id);
	student s=op.get();
	return s;
	}
	@GetMapping("/findname")
	public List<admin> fetchadminByName(@RequestParam String name){
		List<admin>admin=a1.findByName(name);
		return admin;
	}
@GetMapping("/findall")
public List<admin>fecthAllAdmin(){
	List<admin>admin=a1.findAll();
	return admin;
}

@GetMapping("/findall1")
public List<student>fecthAllStudent(){
	List<student>student=sr.findAll();
	return student;
}
@GetMapping("/findbyage")
public List<student>findbyStudents(@RequestParam int  age){
	List<student>student=sr.findByAgeGreaterThan(age);
	return student;
}

@GetMapping("/findbyage1")
public List<student>findbyStudentsless(@RequestParam int  age){
	List<student>student=sr.findByAgeLessThan(age);
	return student;
}


@DeleteMapping("/delete")
public String deletestudent(@RequestParam int id) {
	sr.deleteById(id);
	return "data deleted sucessfully";
}

@DeleteMapping("/deleteall")
public String deleteAllstudent() {
	sr.deleteAll();
	return "All data deleted sucessfully";
}

@PutMapping("/update")
public String updatestudent(@RequestBody student s) {
	sr.save(s);
	return "data updated succesfully";
}

}
