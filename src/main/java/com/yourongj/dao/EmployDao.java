package com.yourongj.dao;

import com.yourongj.model.Employ;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployDao {
    @Select("select * from employ")
    public List<Employ> findAll();
    @Insert("insert into employ(id,name,sex,address) values(#{id},#{name},#{sex},#{address})")
    public void saveEmploy(Employ employ);
    @Delete("delete from employ where id = #{id}")
    public int delete(int id);

    @Update("update employ set name = #{name} ,sex = #{sex},address=#{address} where id = #{id}")
    public int update(Employ employ);
}