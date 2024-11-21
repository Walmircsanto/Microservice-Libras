package com.libras.microservice.controller;

import com.libras.microservice.entity.LibrasEntity;
import com.libras.microservice.service.LibrasService;
import com.libras.microservice.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinais")
public class LibrasController {

    @Autowired
    LibrasService librasService;

    @Autowired
    Suggest sugerLibra;


    @PostMapping("/")
    public ResponseEntity<LibrasEntity> saveLibras(@RequestBody LibrasEntity libras) {
        return new ResponseEntity<>(librasService.save(libras), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity getLibrasById( @PathVariable Long id) {
        return new ResponseEntity<>(librasService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/")
    public List<LibrasEntity> getAllLibras() {
        return librasService.findAll();
    }


    @PostMapping("/sugeri/{id}")
    public ResponseEntity<String> sugeriLibras(@PathVariable Long id,@RequestBody LibrasEntity libras) {
       return new ResponseEntity<>(sugerLibra.sugerirMidia(id,libras), HttpStatus.CREATED);
    }
}
