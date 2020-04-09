package in.satheeshtech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.satheeshtech.model.Employee;

@RestController
public class RestDemoController {
	
	@GetMapping("/demo")
	public String Demo()
	{
		return "success";
	}
	@GetMapping(value= "/get/user",produces="application/json")
	public Employee getEmployee()
	{
		return new Employee(50,"satheesh");
	}
	
	@GetMapping(value= "/get/users",produces="application/json")
	public List<Employee> getUserDataList(){
		List<Employee> datalist = new ArrayList<>();
		datalist.add(new Employee(30,"Ramesh"));
		datalist.add(new Employee(10,"Karthik"));
		datalist.add(new Employee(11,"Saravanan"));
		return datalist;
		
		
	}

}
