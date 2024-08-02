package com.sic.project.services;


import com.sic.project.model.TipoServicio;
import com.sic.project.repository.TipoServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoServicioServiceImplementation implements TipoServicioService {

    @Autowired
    private TipoServicioRepository tipoServicioRepository;


    @Override
    public TipoServicio newTipoServicio(TipoServicio newTipoServicio) {
        return tipoServicioRepository.save(newTipoServicio);
    }

    @Override
    public Iterable<TipoServicio> getAll() {
        return this.tipoServicioRepository.findAll();
    }

    @Override
    public TipoServicio modifyTipoServicio(TipoServicio tipoServicio) {
        Optional<TipoServicio> tipoServicioEncontrado = this.tipoServicioRepository.findById(tipoServicio.getId_tipo_servicio());
        if(tipoServicioEncontrado.get()!=null) {
            tipoServicioEncontrado.get().setServicio(tipoServicio.getServicio());
            tipoServicioEncontrado.get().setDescripcion(tipoServicio.getDescripcion());

            return this.newTipoServicio(tipoServicioEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteTipoServicio(Long id_tipo_servicio) {
        this.tipoServicioRepository.deleteById(id_tipo_servicio);
        return true;
    }
}
