package sample.kafkaexample;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * packageName    : sample.kafkaexample
 * fileName       : CheckOutSubmitController
 * author         : jongh
 * date           : 2024-10-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-07           jongh          최초 생성
 */

@Slf4j
@Controller
@RequiredArgsConstructor
public class CheckOutSubmitController {

    private final SaveService saveService;

    @PostMapping("/submitCheckOut")
    public String submitCheckOut(CheckOutDto checkOutDto, Model model) {

        log.info(checkOutDto.toString());
        Long checkOutId = saveService.saveCheckOutData(checkOutDto);
        model.addAttribute("checkOutId", checkOutId);
        return "submitComplete";
    }
}