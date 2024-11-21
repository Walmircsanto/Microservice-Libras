package com.libras.microservice.controller;

import com.libras.microservice.entity.Usuario;
import com.libras.microservice.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.createUsuario(usuario), HttpStatus.CREATED);
    }


    @GetMapping("/")
    public ResponseEntity finById(Long id) {
        return new ResponseEntity<>(usuarioService.findById(id), HttpStatus.OK);
    }
}
