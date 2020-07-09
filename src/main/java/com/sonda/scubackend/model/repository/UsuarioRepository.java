package com.sonda.scubackend.model.repository;

import com.sonda.scubackend.model.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
