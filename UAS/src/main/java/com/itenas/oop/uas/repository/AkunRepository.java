package com.itenas.oop.uas.repository;

import java.util.List;

public interface AkunRepository<T, ID> {
    T login(String username, String password);
    List<T> findAll();
    ID create(T object);
    ID update(T object);
    T findById(int id);
    ID delete(int id);
}

