package com.libras.microservice.repository;

import com.libras.microservice.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
