package pay.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Pay {

    @Id
    private Integer employeeID;

    @NotNull
    private Double payAmount;

    private Double bonusAmount;

    public Pay(Integer employeeID, Double payAmount) {
        this.employeeID = employeeID;
        this.payAmount = payAmount;
    }

    public Pay(Integer employeeID, Double payAmount, Double bonusAmount) {
        this.employeeID = employeeID;
        this.payAmount = payAmount;
        this.bonusAmount = bonusAmount;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(Double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }
}
