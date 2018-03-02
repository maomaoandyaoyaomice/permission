package org.aptech.shiro.permission.controller;

import java.util.List;

import javax.annotation.Resource;

import org.aptech.shiro.permission.dao.SysRoleDao;
import org.aptech.shiro.permission.pojo.SysRole;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/role")
public class SysRoleController {
	@Resource
	private SysRoleDao sysRoleDao;

	public void setSysRoleDao(SysRoleDao sysRoleDao) {
		this.sysRoleDao = sysRoleDao;
	}
	
	@RequestMapping("/all")
	@ResponseBody
	public List<SysRole> all() throws Exception {
		return sysRoleDao.getAll();
	}
	
}






