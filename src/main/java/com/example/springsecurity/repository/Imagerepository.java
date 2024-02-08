package com.example.springsecurity.repository;

import com.example.springsecurity.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Imagerepository extends JpaRepository<Images,Integer> {
    @Query("select i from Images i where i.idannonce = :idannonce")
    List<Images> getimageannonce(@Param("idannonce") int idannonce);

}
