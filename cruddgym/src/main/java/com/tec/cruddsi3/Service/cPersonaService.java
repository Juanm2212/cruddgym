package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iPersonaService;
import com.tec.cruddsi3.interfaces.iPersona;
import com.tec.cruddsi3.model.cPersona;
@Service
public class cPersonaService implements iPersonaService{
    @Autowired
    private iPersona data;
    
    @Override
    public List<cPersona> find(){
        return (List<cPersona>) data.findAll();
    }
    @Override
    public Optional<cPersona> findById(int id){
        return (Optional<cPersona>) data.findById(id);
    }
    @Override
    public int save(cPersona obj){
        int res=0;
        cPersona oPersona = data.save(obj);
        if (oPersona.equals(null)) {
            res=1;
        }
        return res;
    }
    @Override
    public void delete(int id){
        data.deleteById(id);
    }
}
