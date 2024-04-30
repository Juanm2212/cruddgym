package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iRollService;
import com.tec.cruddsi3.interfaces.iRoll;
import com.tec.cruddsi3.model.cRoll;

@Service
public class cRollService implements iRollService {
    @Autowired
    private iRoll data;
    
    @Override
    public List<cRoll> find(){
        return (List<cRoll>) data.findAll();
    }
    @Override
    public Optional<cRoll> findById(int id){
        return (Optional<cRoll>) data.findById(id);
    }
    @Override
    public int save(cRoll obj){
        int res=0;
        cRoll oProducto = data.save(obj);
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
