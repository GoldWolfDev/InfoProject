/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.model;

/**
 *
 * @author root
 */
public class LoginAuthModel {
    
    private int id;
    
    private String login;
    
    private String psw;
    
    private String firstName;
    
    private String lastName; 
    
    private String nameRole;
    
    private int levelRole;
    
    private int idRole;

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
    
    
    
    public LoginAuthModel(){
        
    }

    public LoginAuthModel(String login, String psw) {
        this.login = login;
        this.psw = psw;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public int getLevelRole() {
        return levelRole;
    }

    public void setLevelRole(int levelRole) {
        this.levelRole = levelRole;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
