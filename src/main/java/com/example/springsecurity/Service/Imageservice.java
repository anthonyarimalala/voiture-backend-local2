package com.example.springsecurity.Service;

import com.example.springsecurity.model.Images;

import java.util.List;

public interface Imageservice {
    public List<Images> getimagebyidannonce(int idannonce);

    public Images insererimage(Images images);
}
