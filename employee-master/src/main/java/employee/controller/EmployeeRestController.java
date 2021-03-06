package employee.controller;

import employee.model.Employee;
import employee.model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/API")
public class EmployeeRestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(path = "/hire")
    public String hireEmployee(@RequestParam String firstName, @RequestParam String lastName) {

        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setJobStatusCode("A");
        employeeRepository.save(employee);

        return "Employee Hired!";
    }

}
