package sample.kafkaexample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * packageName    : sample.kafkaexample
 * fileName       : CheckOutDto
 * author         : jongh
 * date           : 2024-10-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-08           jongh          최초 생성
 */

@Setter
@Getter
@ToString
public class CheckOutDto {

    private Long checkOutId;
    private Long memberId;
    private Long productId;
    private Long amount;
    private String shippingAddress;
    private Date createdAt;
}