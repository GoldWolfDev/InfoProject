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
        getUser = myBatis.getUser(tLogin, tPassw);
        if(getUser == null){
            return "resources/error/loginFail";
        }else{
            if(getUser.getLogin().equals(tLogin) & getUser.getPsw().equals(tPassw)){               
                if(getUser.getLevelRole()>3){
                   return "AdminConsole"; 
                }else {
                    return "UserConsole";
                }              
                                 
            }else{
                return "resources/error/loginFail";
            }               
        }
        
    }    
}
