package com.test.mapper;

import java.util.List;

import com.test.domain.Address;

public interface AddressMapper {
    public List<Address> list();

    public void insert(Address address);

    public void delete(long seq);
}
