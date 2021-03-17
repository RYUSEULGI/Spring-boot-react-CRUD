package com.example.demo.cmm.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.domain.Common;

public interface CommonService {
    public long count();
    public void deleteById(long id);
    public void deleteAll(Iterable<Common> entities);
    public Optional<Common> findById(long id);
    public List<Common> findAllById(Iterable<Common> ids);
    public Optional<Common> findOne(Common common);
    public List<Common> findAll();
    public Common save(Common entity);
    public List<Common> saveAll(Iterable<Common> entities);
    public boolean existsById(long id);
    public Common getOne(long id);
}
 