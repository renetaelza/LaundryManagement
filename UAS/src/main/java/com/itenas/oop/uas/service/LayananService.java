/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itenas.oop.uas.service;

import com.itenas.oop.uas.pojo.Layanan;
import com.itenas.oop.uas.repository.CrudRepository;

/**
 *
 * @author ASUS
 */
public interface LayananService extends CrudRepository<Layanan, Integer>{
    public Layanan findByName(String namaLayanan);
}
