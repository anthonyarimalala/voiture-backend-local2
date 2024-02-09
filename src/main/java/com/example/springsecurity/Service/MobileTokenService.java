package com.example.springsecurity.Service;

import com.example.springsecurity.model.MobileToken;
import com.example.springsecurity.repository.MobileTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileTokenService {

    private final MobileTokenRepository repository;

    @Autowired
    public MobileTokenService(MobileTokenRepository repository) {
        this.repository = repository;
    }

    public List<MobileToken> findAll() {
        return repository.findAll();
    }

    public MobileToken findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<MobileToken> findsByUserId(Integer userId) {
        return repository.findByUserId(userId);
    }

    public MobileToken save(MobileToken token) {
        return repository.save(token);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
