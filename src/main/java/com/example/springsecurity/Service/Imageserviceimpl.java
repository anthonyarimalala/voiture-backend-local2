package com.example.springsecurity.Service;

import com.example.springsecurity.model.Images;
import com.example.springsecurity.repository.Imagerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Imageserviceimpl implements Imageservice{
    @Autowired
    private Imagerepository imagerepository;

    @Override
    public Images insererimage(Images images) {
        return imagerepository.save(images);
    }

    @Override
    public List<Images> getimagebyidannonce(int idannonce) {
        return imagerepository.getimageannonce(idannonce);
    }
}
