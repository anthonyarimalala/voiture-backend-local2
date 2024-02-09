package com.example.springsecurity.repository;

import com.example.springsecurity.model.MobileToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MobileTokenRepository extends JpaRepository<MobileToken, Integer> {
    List<MobileToken> findByUserId(Integer userId);
}
