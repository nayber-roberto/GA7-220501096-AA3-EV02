package com.sic.project.controller;

import com.sic.project.model.TipoServicio;
import com.sic.project.model.TipoServicio;
import com.sic.project.services.TipoServicioService;
import com.sic.project.services.TipoServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tipo-usuario")

public class TipoServicioController {

    @Autowired
    private TipoServicioService tipoServicioService;

    @PostMapping("/nuevo")

    public TipoServicio newTipoServicio(@RequestBody TipoServicio newTipoServicio) {
        return this.tipoServicioService.newTipoServicio(newTipoServicio);
    }

    @GetMapping("/mostrar")
    public Iterable<TipoServicio> getAll() {
        return tipoServicioService.getAll();
    }

    @PostMapping("/modificar")
    public TipoServicio modifyTipoServicio(@RequestBody TipoServicio tipoServicio) {
        return this.tipoServicioService.modifyTipoServicio(tipoServicio);
    }

    @PostMapping (value = "/{id}")
    public Boolean deleteTipoServicio(@PathVariable(value = "id") Long id) {
        return this.tipoServicioService.deleteTipoServicio(id);
    }



}
