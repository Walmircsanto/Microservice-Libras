package com.libras.microservice.service;

import com.libras.microservice.entity.LibrasEntity;
import com.libras.microservice.repository.LibrasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrasService {

    @Autowired
    LibrasRepository librasRepository;


    public LibrasEntity save(LibrasEntity librasEntity) {
        return librasRepository.save(librasEntity);
    }

    public LibrasEntity findById(Long id) {
        return librasRepository.findById(id).get();
    }

    public List<LibrasEntity> findAll() {
        return librasRepository.findAll();
    }

}
