package com.test.mapper;

import java.util.List;

import com.test.domain.Address;
import com.test.domain.AddressFile;

public interface AddressMapper {
    public List<Address> list();
    public void insert(Address address);
    public void delete(long seq);
    public void insertSelectKey(Address address);
    public void insertFile(AddressFile addrFile);
}
