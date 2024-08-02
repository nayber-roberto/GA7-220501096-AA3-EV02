package com.sic.project.services;

import com.sic.project.model.TipoServicio;
import com.sic.project.model.Usuario;

public interface TipoServicioService {
    TipoServicio newTipoServicio (TipoServicio newTipoServicio);
    Iterable<TipoServicio> getAll();
    TipoServicio modifyTipoServicio (TipoServicio tipoServicio);
    Boolean deleteTipoServicio (Long id_tipo_servicio);
}
