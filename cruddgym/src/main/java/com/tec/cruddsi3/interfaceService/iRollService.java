package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cRoll;

public interface iRollService {
    public List<cRoll> find();
    public Optional<cRoll> findById(int id);
    public int save(cRoll obj);
    public void delete(int id);
}
