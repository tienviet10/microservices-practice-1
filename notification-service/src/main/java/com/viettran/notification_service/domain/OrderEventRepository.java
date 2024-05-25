package com.viettran.notification_service.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEventRepository extends JpaRepository<OrderEventEntity, Long> {
    boolean existsByEventId(String eventId);
}
