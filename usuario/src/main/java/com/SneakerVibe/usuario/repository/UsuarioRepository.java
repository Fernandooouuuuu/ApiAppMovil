package com.SneakerVibe.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SneakerVibe.usuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
