package com.yourongj.service.impl;

import com.yourongj.dao.EmployDao;
import com.yourongj.model.Employ;
import com.yourongj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceimpl implements EmpService {
    @Autowired
    EmployDao employDao;
    public List<Employ> findAll() {
        return employDao.findAll();
    }

    public void saveEmploy(Employ employ) {
        employDao.saveEmploy(employ);

    }

    public int delete(int id) {
        employDao.delete(id);
        return 0;
    }

    public int update(Employ employ) {
        employDao.update(employ);
        return 0;
    }
}
