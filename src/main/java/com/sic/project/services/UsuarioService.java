package com.sic.project.services;

import com.sic.project.model.Usuario;

public interface UsuarioService {
    Usuario newUsuario(Usuario newUsuario);
    Iterable<Usuario> getAll();
    Usuario modifyUsuario(Usuario usuario);
    Boolean deleteUsuario(Long id_usuario);
}
