package pay;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pay.controller.PayRestController;
import pay.model.PayRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeansLoad {

    @Autowired
    private PayRestController payRestController;

    @Autowired
    private PayRepository payRepository;

    @Test
    public void payRestControllerLoads() throws Exception {
        assertThat(payRestController).isNotNull();
    }

    @Test
    public void payRepositoryLoads() throws Exception {
        assertThat(payRepository).isNotNull();
    }
}
