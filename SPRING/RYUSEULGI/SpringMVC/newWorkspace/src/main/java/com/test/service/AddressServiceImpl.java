package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.Address;
import com.test.mapper.AddressMapper;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> list() {
        return addressMapper.list();
    }

    @Override
    public void insert(Address address) {
        addressMapper.insert(address);
    }

    @Override
    public void delete(long seq) {
        addressMapper.delete(seq);
    }

}
