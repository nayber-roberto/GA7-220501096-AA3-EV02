package com.sic.project.controller;

import com.sic.project.model.Membresia;
import com.sic.project.services.MembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/membresia")

public class MembresiaController {

    @Autowired
    private MembresiaService membresiaService;

    @PostMapping("/nuevo")

    public Membresia newMembresia(@RequestBody Membresia newMembresia) {
        return this.membresiaService.newMembresia(newMembresia);
    }

    @GetMapping("/mostrar")
    public Iterable<Membresia> getAll() {
        return membresiaService.getAll();
    }

    @PostMapping("/modificar")
    public Membresia modifyMembresia(@RequestBody Membresia membresia) {
        return this.membresiaService.modifyMembresia(membresia);
    }

    @PostMapping (value = "/{id}")
    public Boolean deleteMembresia(@PathVariable(value = "id") Long id) {
        return this.membresiaService.deleteMembresia(id);
    }



}
