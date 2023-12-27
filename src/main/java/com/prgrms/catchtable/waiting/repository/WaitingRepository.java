package com.prgrms.catchtable.waiting.repository;

import com.prgrms.catchtable.member.domain.Member;
import com.prgrms.catchtable.shop.domain.Shop;
import com.prgrms.catchtable.waiting.domain.Waiting;
import com.prgrms.catchtable.waiting.domain.WaitingStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WaitingRepository extends JpaRepository<Waiting, Long> {
    boolean existsByMember(Member member);
    Long countByShopAndStatusAndCreatedAtBetween(Shop shop, WaitingStatus status, LocalDateTime start, LocalDateTime end);
    Long countByShopAndCreatedAtBetween(Shop shop, LocalDateTime start, LocalDateTime end);
}
