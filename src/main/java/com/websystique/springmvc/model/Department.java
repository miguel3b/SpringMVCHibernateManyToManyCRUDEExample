package com.websystique.springmvc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer department;
	
	@Column(unique=true, nullable=false)
	private String descripcion;
	
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)  //mappedBy: Este atributo contendrá el nombre de la propiedad Java de la clase hija que enlaza con la clase padre. En nuestro ejemplo es el nombre de la propiedad profesor que se encuentra en la clase CorreoElectronico.
	private Set<User> listUser;

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return this.getDescripcion();
	}

	public Set<User> getListUser() {
		return listUser;
	}

	public void setListUser(Set<User> listUser) {
		this.listUser = listUser;
	}

}
