package com.example.springsecurity.controller;

import com.example.springsecurity.Service.MobileNotificationService;
import com.example.springsecurity.model.MobileNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobile/notifications")
@CrossOrigin
public class MobileNotificationController {
    private final MobileNotificationService service;

    @Autowired
    public MobileNotificationController(MobileNotificationService service) {
        this.service = service;
    }

    @GetMapping
    public List<MobileNotification> getAllNotifications() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public List<MobileNotification> findsById(@PathVariable Integer id) {
        return service.findsById(id);
    }

    @PostMapping
    public MobileNotification createNotification(@RequestBody MobileNotification notification) {
        return service.save(notification);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
