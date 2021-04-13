package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.test.domain.Address;

public interface AddressService {
    public List<Address> list();
    public void insert(Address address, ArrayList<MultipartFile> files);
    public void delete(long seq);
    public void remove();
    public void removeBySeq(long seq);
}
