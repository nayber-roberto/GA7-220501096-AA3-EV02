package com.sic.project.services;

import com.sic.project.model.Membresia;
import com.sic.project.repository.MembresiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MembresiaServiceImplementation implements MembresiaService {

    @Autowired
    private MembresiaRepository membresiaRepository;

    @Override
    public Membresia newMembresia(Membresia newMembresia) {
        return membresiaRepository.save(newMembresia);
    }

    @Override
    public Iterable<Membresia> getAll() {
        return this.membresiaRepository.findAll();
    }

    @Override
    public Membresia modifyMembresia(Membresia membresia) {
        Optional<Membresia> membresiaEncontrado = this.membresiaRepository.findById(membresia.getId_membresia());
        if(membresiaEncontrado.get() != null) {
            membresiaEncontrado.get().setTipo(membresia.getTipo());
            membresiaEncontrado.get().setCosto(membresia.getCosto());
            membresiaEncontrado.get().setFecha_caducidad(membresia.getFecha_caducidad());
            return this.newMembresia(membresiaEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteMembresia(Long id_membresia) {
        this.membresiaRepository.deleteById(id_membresia);
        return true;
    }
}
