package com.sonda.scubackend.controller;


import com.sonda.scubackend.model.entidade.Usuario;
import com.sonda.scubackend.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario salvar(@RequestBody @Valid Usuario usuario){
        return repository.save(usuario);
    }

    @GetMapping
    public List<Usuario> obterTodos(){
        return repository.findAll();
    }


}
