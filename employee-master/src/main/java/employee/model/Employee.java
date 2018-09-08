package employee.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeID;

    @NotNull
    @Size(max=20)
    @Column(nullable = false)
    private String firstName;

    @NotNull
    @Size(max=20)
    @Column(nullable = false)
    private String lastName;

    @NotNull
    @Size(max=1)
    @Column(nullable = false)
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
