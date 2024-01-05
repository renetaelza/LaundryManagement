/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itenas.oop.uas.service;

import com.itenas.oop.uas.pojo.Admin;
import com.itenas.oop.uas.repository.AkunRepository;

/**
 *
 * @author renet
 */
public interface AdminService extends AkunRepository<Admin, Integer> {
    public boolean register(Admin admin);

    public boolean isUsernameExists(String username);
}
