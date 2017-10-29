package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websystique.springmvc.dao.UserDepartmentDao;
import com.websystique.springmvc.model.Department;

@Service("userDepartmentService")
@Transactional
public class UserDepartmentServiceImpl implements UserDepartmentService{
	
	@Autowired
	UserDepartmentDao userDepartmentDaoImpl;

	public Department findById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Department findByDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Department> findAll() {
		return userDepartmentDaoImpl.findAll();
	}

	public void saveDepartment(Department department) {
		// TODO Auto-generated method stub
		
	}

	public void updateDepartment(Department department) {
		// TODO Auto-generated method stub
		
	}

}
