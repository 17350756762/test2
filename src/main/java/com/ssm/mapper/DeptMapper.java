package com.ssm.mapper;

import com.ssm.bean.Dept;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-05 11:46
 */
public interface DeptMapper {

    //获取所有的部门信息
    List<Dept> getAllDept();

}
