package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.Dept;
import com.ssm.bean.Emp;
import com.ssm.service.EmpService;
import com.ssm.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-09-05 11:44
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService service;

    @RequestMapping(value="/emps/{pageNum}", method=RequestMethod.GET)
    public String getAllEmp(Map<String,Object> map, @PathVariable("pageNum")Integer pageNum, HttpServletRequest request){
        //通过PageHelper设置页面信息，第一个参数为页数，第二个参数为每页显示的条数
        PageHelper.startPage(pageNum, 4);
        List<Emp> empList = service.getAllEmp();
        PageInfo<Emp> pageInfo = new PageInfo<>(empList, 5);
        String page = PageUtil.getPageInfo(pageInfo, request);
        map.put("empList", empList);
        map.put("page", page);
        return "list";

    }
    @RequestMapping(value="/emp/{eid}", method=RequestMethod.GET)
    public String toUpdate(@PathVariable("eid") String eid, Map<String, Object> map) {
        //要修改的员工信息
        Emp emp = service.getEmpByEid(eid);
        //所有的部门信息
        List<Dept> deptList = service.getAllDept();
        //获取存储性别的map
        Map<String, String> sex = new HashMap<>();
        sex.put("0", "女");
        sex.put("1", "男");

        map.put("emp", emp);
        map.put("deptList", deptList);
        map.put("sex", sex);

        return "update";
    }

    @RequestMapping(value="/emp", method=RequestMethod.PUT)
    public String updateEmp(Emp emp) {
        service.updateEmp(emp);
        return "redirect:/emps/1";
    }
}
