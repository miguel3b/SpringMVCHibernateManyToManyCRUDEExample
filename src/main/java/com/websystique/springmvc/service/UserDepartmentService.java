package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.Department;

public interface UserDepartmentService {
	
	public Department findById(Integer Id);
	
	public Department findByDescription(String description);
	
	public List<Department> findAll();
	
	public void saveDepartment(Department department);
	
	public void updateDepartment(Department department);

}
