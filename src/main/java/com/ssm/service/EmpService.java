package com.ssm.service;

import com.ssm.bean.Dept;
import com.ssm.bean.Emp;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-05 11:44
 */
public interface EmpService {
    List<Emp> getAllEmp();
    Emp getEmpByEid(String eid);

    void updateEmp(Emp emp);
    List<Dept> getAllDept();
}
