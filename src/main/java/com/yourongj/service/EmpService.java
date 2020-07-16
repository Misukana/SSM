package com.yourongj.service;

import com.yourongj.model.Employ;

import java.util.List;

public interface EmpService {
    public List<Employ> findAll();
    public void saveEmploy(Employ employ);
}
