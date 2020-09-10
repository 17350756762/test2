package com.ssm.service.impl;

import com.ssm.bean.Dept;
import com.ssm.bean.Emp;
import com.ssm.mapper.DeptMapper;
import com.ssm.mapper.EmpMapper;
import com.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-05 11:45
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper mapper;
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Emp> getAllEmp() {

        return mapper.getAllEmp();

    }
    @Override
    public Emp getEmpByEid(String eid) {
        return mapper.getEmpByEid(eid);
    }

    @Override
    public void updateEmp(Emp emp) {
        mapper.updateEmp(emp);
    }
    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }
}
