package com.example.springsecurity.controller;

import com.example.springsecurity.Service.Imageservice;
import com.example.springsecurity.model.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Imagecontroller {
    @Autowired
    private Imageservice imageservice;
    @PostMapping("/inserer_image")
    public String insererimage(@RequestBody Images images){
        imageservice.insererimage(images);
        return "save";
    }
    @GetMapping("/images/{idannonce}")
    public List<Images> getimagebyidannonce(@PathVariable int idannonce){
        return imageservice.getimagebyidannonce(idannonce);
    }
 }
