package com.libras.microservice.service;

import com.libras.microservice.entity.LibrasEntity;
import com.libras.microservice.entity.Usuario;
import com.libras.microservice.repository.LibrasRepository;
import com.libras.microservice.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Suggest {

    @Autowired
    private UsuarioRepository usuarioService;


    @Autowired
    private LibrasRepository librasService;


    public String sugerirMidia(Long id, LibrasEntity libras) {
        Usuario user = usuarioService.findById(id).get();

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        libras.setSugeriu(user);
        librasService.save(libras);

        return "Libras: " + libras.getPalavra() + "Sugerida com sucesso " +"por" + user.getNome() +"aguarde a resposta do avaliador";
    }
}
