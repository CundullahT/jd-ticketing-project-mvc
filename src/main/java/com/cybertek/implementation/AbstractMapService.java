package com.cybertek.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<ID, T> {

    protected Map<ID, T> map = new HashMap<>();

    T save(ID id, T t){
        map.put(id,t);
        return t;
    }

    List<T> findAll(){
        return new ArrayList<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }

    void deleteByID(ID id){
        map.remove(id);
    }

    void delete(T t){
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

}
