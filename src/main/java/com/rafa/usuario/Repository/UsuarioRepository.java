package com.rafa.usuario.Repository;

import com.rafa.usuario.Entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario,Long> {



}
