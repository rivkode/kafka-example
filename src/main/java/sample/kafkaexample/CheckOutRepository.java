package sample.kafkaexample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : sample.kafkaexample
 * fileName       : CheckOutRepository
 * author         : jongh
 * date           : 2024-10-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-08           jongh          최초 생성
 */


@Repository
public interface CheckOutRepository extends JpaRepository<CheckOutEntity, Long> {
}