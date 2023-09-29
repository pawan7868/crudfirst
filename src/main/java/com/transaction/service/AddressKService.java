package com.transaction.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.entity.AddressK;
import com.transaction.repository.AddressKRepository;

@Service
public class AddressKService {
      
    @Autowired
    private AddressKRepository addressRepository;
      
    public AddressK addAddress(AddressK address) {
        AddressK addressSavedToDB = this.addressRepository.save(address);
        return addressSavedToDB;
    }}