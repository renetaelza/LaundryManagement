/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itenas.oop.uas.repository;

import java.util.List;

public interface CrudRepository<T, ID> {
    List<T> findAll();
    ID create(T object);
    ID update(T object);
    T findById(int id);
    ID delete(int id);
}

