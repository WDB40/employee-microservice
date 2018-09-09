package pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pay.model.Pay;
import pay.model.PayRepository;

@RestController
@RequestMapping(path = "/API")
public class PayRestController {

    @Autowired
    PayRepository payRepository;

    @GetMapping(path = "/setPay")
    public Pay setPay(@RequestParam("employeeID") Integer employeeId, @RequestParam("payAmount") Double payAmount) {

        Pay pay = new Pay(employeeId, payAmount);
        pay.setEmployeeID(employeeId);
        pay.setPayAmount(payAmount);

        payRepository.save(pay);

        return pay;
    }


}
