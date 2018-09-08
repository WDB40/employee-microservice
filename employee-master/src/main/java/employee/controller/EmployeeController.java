package employee.controller;

import employee.model.Employee;
import employee.model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    
    @Autowired
    EmployeeRepository employeeRepository;
    
    @GetMapping("/hire")
    public String hireEmployee(Employee employee){
        return "hire";
    }
    
}
