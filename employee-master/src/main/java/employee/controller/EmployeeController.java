package employee.controller;

import employee.model.Employee;
import employee.model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/hire")
    public String hireEmployee(Employee employee){
        System.out.println("Initial enter into hire form.");
        return "hire";
    }

    @PostMapping("/hire")
    public String attemptToHire(@Valid Employee employee, BindingResult result){

        System.out.println("Attempting to validate entry.");

        if(result.hasErrors()) {
            return "hire";
        }

        employeeRepository.save(employee);
        return "hired";
    }

}
