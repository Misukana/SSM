package com.yourongj.dao;

import com.yourongj.model.Employ;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployDao {
    @Select("select * from employ")
    public List<Employ> findAll();
    @Insert("insert into employ(id,name,sex,address) values(#{id},#{name},#{sex},#{address})")
    public void saveEmploy(Employ employ);
}