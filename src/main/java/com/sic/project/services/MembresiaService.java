package com.sic.project.services;

import com.sic.project.model.Membresia;

public interface MembresiaService {
    Membresia newMembresia(Membresia newMembresia);
    Iterable<Membresia> getAll();
    Membresia modifyMembresia(Membresia membresia);
    Boolean deleteMembresia(Long id_membresia);
}
