package employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeID;
    private String firstName;
    private String lastName;
    private String jobStatusCode;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobStatusCode() {
        return jobStatusCode;
    }

    public void setJobStatusCode(String jobStatusCode) {
        this.jobStatusCode = jobStatusCode;
    }
}
