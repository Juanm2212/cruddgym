package com.tec.cruddsi3.interfaces;





import org.springframework.data.repository.CrudRepository;

import com.tec.cruddsi3.model.cProducto;

public interface iProducto extends CrudRepository<cProducto, Integer> {
    
}
