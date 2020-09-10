package com.ssm.mapper;

import com.ssm.bean.Emp;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-05 11:46
 */
public interface EmpMapper {

    //查询所有员工信息
    List<Emp> getAllEmp();
    //根据eid获取员工信息
    Emp getEmpByEid(String eid);

    //修改员工信息
    void updateEmp(Emp emp);
}
