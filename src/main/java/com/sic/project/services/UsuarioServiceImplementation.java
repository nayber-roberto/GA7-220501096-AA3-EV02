package com.sic.project.services;

import com.sic.project.model.Usuario;
import com.sic.project.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImplementation implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario newUsuario(Usuario newUsuario) {
        return usuarioRepository.save(newUsuario);
    }

    @Override
    public Iterable<Usuario> getAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario modifyUsuario(Usuario usuario) {
        Optional<Usuario> usuarioEncontrado = this.usuarioRepository.findById(usuario.getId_usuario());
        if(usuarioEncontrado.get() != null) {
            usuarioEncontrado.get().setIdentificacion(usuario.getIdentificacion());
            usuarioEncontrado.get().setNombre(usuario.getNombre());
            usuarioEncontrado.get().setCorreo_electronico(usuario.getCorreo_electronico());
            usuarioEncontrado.get().setIdentificacion(usuario.getIdentificacion());
            usuarioEncontrado.get().setContrasena(usuario.getContrasena());
            usuarioEncontrado.get().setFecha_registro(usuario.getFecha_registro());
            usuarioEncontrado.get().setTelefono(usuario.getTelefono());
            usuarioEncontrado.get().setDireccion(usuario.getDireccion());
            usuarioEncontrado.get().setMembresia(usuario.getMembresia());
            return this.newUsuario(usuarioEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteUsuario(Long id_usuario) {
        this.usuarioRepository.deleteById(id_usuario);
        return true;
    }
}
