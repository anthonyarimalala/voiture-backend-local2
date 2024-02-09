package com.example.springsecurity.repository;

import com.example.springsecurity.model.MobileNotification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MobileNotificationRepository extends JpaRepository<MobileNotification, Integer> {
    List<MobileNotification> findByReceiverId(Integer userId);
}
