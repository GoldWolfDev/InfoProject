/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.controller;

import com.inform.project.model.LoginAuthModel;
import com.inform.project.dao.MyBatisAdminImpl;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.inform.project.controller.abstraction.Login;
import com.sun.faces.context.FacesContextImpl;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.component.commandbutton.CommandButton;

/**
 *
 * @author root
 */
@ManagedBean(name = "action")
@SessionScoped
public class LoginImpl implements Login, Serializable{
    
    private final Serializable id = 1L;
    
    private String urlLogin;

    private String tLogin;
    
    private String tPassw;

    public String getUrlLogin() {
        return urlLogin;
    }

    public void setUrlLogin(String urlLogin) {
        this.urlLogin = urlLogin;
    }

    public void settLogin(String tLogin) {
        this.tLogin = tLogin;
    }

    public void settPassw(String tPassw) {
        this.tPassw = tPassw;
    }

    public String gettLogin() {
        return tLogin;
    }

    public String gettPassw() {
        return tPassw;
    }
    
    @Override
    public String validLoginAndPassw() {
        MyBatisAdminImpl myBatis = new MyBatisAdminImpl();
        LoginAuthModel getUser = null;
        String getURL = "";
        getUser = myBatis.getUser(tLogin, tPassw);
        if(getUser == null){
            addMessage("Не верный логин или пароль");
        }else{
            if(getUser.getLogin().equals(tLogin) & getUser.getPsw().equals(tPassw)){               
                if(getUser.getLevelRole()>3){
                   getURL= "AdminConsole"; 
                }else {
                    getURL= "UserConsole";
                }             
            }else{
                addMessage("Не верный логин или пароль");
            }
        }
        return getURL;
    }   
    
    private void addMessage(String detail) { 
        FacesContext context = FacesContext.getCurrentInstance();         
        context.addMessage(null, new FacesMessage("Your message: " + detail)); 
    }
}
