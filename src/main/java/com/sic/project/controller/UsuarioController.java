package com.sic.project.controller;

import com.sic.project.model.Usuario;
import com.sic.project.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/nuevo")

    public Usuario newUsuario(@RequestBody Usuario newUsuario) {
        return this.usuarioService.newUsuario(newUsuario);
    }

    @GetMapping("/mostrar")
    public Iterable<Usuario> getAll() {
        return usuarioService.getAll();
    }

    @PostMapping("/modificar")
    public Usuario modifyUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.modifyUsuario(usuario);
    }

    @PostMapping (value = "/{id}")
    public Boolean deleteUsuario(@PathVariable(value = "id") Long id) {
        return this.usuarioService.deleteUsuario(id);
    }



}
