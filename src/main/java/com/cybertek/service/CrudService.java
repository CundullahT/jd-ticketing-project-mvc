package com.cybertek.service;

import java.util.List;

public interface CrudService<T, ID> {

    List<T> findAll();

    T findByID(ID id);

    T save(T t);

    void delete(T t);

    void deleteByID(ID id);

}
