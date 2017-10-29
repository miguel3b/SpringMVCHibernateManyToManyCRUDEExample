package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Department;

@Repository("userDepartmentDaoImpl")
public class UserDepartmentDaoImpl extends AbstractDao<Integer,Department> implements UserDepartmentDao{

	public Department findById(Integer Id) {
		Department department = getByKey(Id);
		
		if(department != null){
			Hibernate.initialize(department.getListUser());
		}
		return null;
	}

	public Department findByDescription(String description) {
		
		System.out.println("descripcion :::" + description);
		
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("descripcion", description));
		
		Department dep = (Department)crit.uniqueResult();
		
		if(dep != null){
			Hibernate.initialize(dep.getListUser());
		}
		
		return dep;
	}

	@SuppressWarnings("unchecked")
	public List<Department> findAll() {
		
		Criteria crit = createEntityCriteria().addOrder(Order.asc("description"));
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY); // Pare evitar duplicados
		List<Department> listDepartment = (List<Department>) crit.list();
		
		return listDepartment;
	}

	public void saveDepartment(Department department) {
		persist(department);
	}

	public void updateDepartment(Department department) {  // se deberia cambiar el parametro que se recibe para que unicamente se reciba el id de el departamento
		delete(department);
	}

}
