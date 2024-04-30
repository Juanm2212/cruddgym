package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cPersona;

public interface iPersonaService {

    public List<cPersona> find();
    public Optional<cPersona> findById(int id);
    public int save(cPersona obj);
    public void delete(int id);
}
