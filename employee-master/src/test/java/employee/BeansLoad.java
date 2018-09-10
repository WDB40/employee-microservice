package employee;

import static org.assertj.core.api.Assertions.assertThat;

import employee.controller.EmployeeController;
import employee.controller.EmployeeRestController;
import employee.model.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeansLoad {

    @Autowired
    private EmployeeController employeeController;

    @Autowired
    private EmployeeRestController employeeRestController;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void employeeControllerLoads() throws Exception {
        assertThat(employeeController).isNotNull();
    }

    @Test
    public void employeeRestControllerLoads() throws Exception {
        assertThat(employeeRestController).isNotNull();
    }

    @Test
    public void employeeRepositoryLoads() throws Exception {
        assertThat(employeeRepository).isNotNull();
    }

}
