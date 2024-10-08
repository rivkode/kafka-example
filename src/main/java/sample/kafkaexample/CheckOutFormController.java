package sample.kafkaexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : sample.kafkaexample
 * fileName       : CheckOutFormController
 * author         : jongh
 * date           : 2024-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-06           jongh          최초 생성
 */

@Slf4j
@Controller
public class CheckOutFormController {

    @GetMapping("checkOutForm")
    public String checkOutForm(Model model) {
        log.info("checkOutForm ...");
        return "checkOutForm";
    }

}
