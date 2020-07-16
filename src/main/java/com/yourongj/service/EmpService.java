package com.yourongj.service;

import com.yourongj.model.Employ;

import java.util.List;

public interface EmpService {
    public List<Employ> findAll();
    public void saveEmploy(Employ employ);
    public int delete(int id);
    public int update(Employ employ);
}
