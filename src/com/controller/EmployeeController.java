package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSONObject;
import com.bean.Employee;
import com.dao.EmployeeDao;

@Controller
@SessionAttributes(value={"employee"})
public class EmployeeController {
	@Autowired
	private EmployeeDao empDao;
	
	@RequestMapping("/login.html")
	public String doLogin(Employee employee,Model model){
		employee = empDao.select(employee);
		Sssssss
		if(employee==null){
			model.addAttribute("message", "用户名或密码错误");
			return "forward:/login.jsp";
		}
		model.addAttribute(employee);
		return "index";
	}

	@RequestMapping(value="/doAjax")
	@ResponseBody
	public String doAjax(Employee employee){
		employee = empDao.select(employee);
		String result =JSONObject.toJSONString(employee);
		return result;
	}
	
	public EmployeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	
}
