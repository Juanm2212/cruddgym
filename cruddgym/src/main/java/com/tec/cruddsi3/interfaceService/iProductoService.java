package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cProducto;

public interface iProductoService {
    public List<cProducto> find();
    public Optional<cProducto> findById(int id);
    public int save(cProducto obj);
    public void delete(int id);
}
