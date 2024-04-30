package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iProductoService;
import com.tec.cruddsi3.interfaces.iProducto;
import com.tec.cruddsi3.model.cProducto;
@Service
public class cProductosService implements iProductoService {
    @Autowired
    private iProducto data;
    
    @Override
    public List<cProducto> find(){
        return (List<cProducto>) data.findAll();
    }
    @Override
    public Optional<cProducto> findById(int id){
        return (Optional<cProducto>) data.findById(id);
    }
    @Override
    public int save(cProducto obj){
        int res=0;
        cProducto oProducto = data.save(obj);
        if (oProducto.equals(null)) {
            res=1;
        }
        return res;
    }
    @Override
    public void delete(int id){
        data.deleteById(id);
    }
}
