/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.controller;

import com.inform.project.dao.abstraction.GetUsersMapper;
import com.inform.project.model.LoginAuthModel;
import com.inform.project.dao.MyBatisAdminImpl;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.inform.project.controller.abstraction.Admin;

/**
 *
 * @author root
 */
//Создание инструметнов для админа
@ManagedBean(name = "mainAction")
@SessionScoped
public class AdminImpl implements Admin, Serializable{
    
    private final Serializable id = 1L;
    
    private int idUser;
    
    private String login;
    
    private String passw;
    
    private String lastName;
    
    private String firstName;
    
    private int idRole;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
    
    
    
    @Override
    public void saveUser() {        
        LoginAuthModel user = new LoginAuthModel();
        user.setLogin(login);
        user.setPsw(passw);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setIdRole(idRole);
        GetUsersMapper insert = new MyBatisAdminImpl();        
        insert.addObject(user);
    }

    @Override
    public void deleteUser() {
        GetUsersMapper delete = new MyBatisAdminImpl();
        delete.deleteObject(idUser);
    }
   
    

    @Override
    public void update() {
        LoginAuthModel user = new LoginAuthModel();
        user.setLogin(login);
        user.setPsw(passw);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setIdRole(idRole);
        user.setId(idUser);
        GetUsersMapper insert = new MyBatisAdminImpl();        
        insert.updateUser(user);
    }

    @Override
    public List<LoginAuthModel> getListUsers() {
        GetUsersMapper list = new MyBatisAdminImpl();
        return list.getList();
    }
}
