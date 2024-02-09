package com.example.springsecurity.controller;

import com.example.springsecurity.Service.MobileTokenService;
import com.example.springsecurity.model.MobileToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobile/tokens")
@CrossOrigin
public class MobileTokenController {

    private final MobileTokenService service;

    @Autowired
    public MobileTokenController(MobileTokenService service) {
        this.service = service;
    }

    @GetMapping
    public List<MobileToken> getAllTokens() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public MobileToken getTokenById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/user/{userId}")
    public List<MobileToken> getTokenByUserId(@PathVariable Integer userId) {
        return service.findsByUserId(userId);
    }

    @PostMapping
    public MobileToken createToken(@RequestBody MobileToken token) {
        return service.save(token);
    }

    @DeleteMapping("/{id}")
    public void deleteToken(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
