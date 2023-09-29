package com.transaction.service;

import javax.transaction.Transactional;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.entity.AddressK;
import com.transaction.entity.EmployeeK;
import com.transaction.repository.EmployeeKRepository;

@Service
public class EmployeeKService {
  
    @Autowired
    private EmployeeKRepository employeeRepository;
      
    @Autowired
    private AddressKService addressService;
      
    @Transactional
    public EmployeeK addEmployee(EmployeeK employee) throws Exception {
        EmployeeK employeeSavedToDB = this.employeeRepository.save(employee);
          
        AddressK address = new AddressK();
        address.setId(123L);
        address.setAddress("Varanasi");
        address.setEmployee(employee);
          
        // calling addAddress() method 
        // of AddressService class
        this.addressService.addAddress(address);
        return employeeSavedToDB;
    }
}