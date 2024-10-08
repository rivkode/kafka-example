package sample.kafkaexample;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

/**
 * packageName    : sample.kafkaexample
 * fileName       : CheckOutEntity
 * author         : jongh
 * date           : 2024-10-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-08           jongh          최초 생성
 */

@Data
@Table(name = "CHECKOUT_TABLE")
@Entity
public class CheckOutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long checkOutId;

    @Column(name = "memberId")
    private Long memberId;

    @Column(name = "productId")
    private Long productId;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "shippingAddress")
    private String shippingAddress;

    @CreationTimestamp
    @Column(name = "createdAt")
    private Timestamp createdAt;
}