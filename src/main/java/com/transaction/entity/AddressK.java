package com.transaction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADD_INFO")
public class AddressK {
      
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    
    // one to one mapping means,
    // one employee stays at one address only
    @OneToOne
    private EmployeeK employee;

	public AddressK(Long id, String address, EmployeeK employee) {
		super();
		this.id = id;
		this.address = address;
		this.employee = employee;
	}

	public AddressK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EmployeeK getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeK employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return id + ", "+address+"  "+ address +"  "+employee;
	}
    
}