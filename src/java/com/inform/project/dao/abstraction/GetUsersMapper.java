/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao.abstraction;

import com.inform.project.model.LoginAuthModel;
import com.inform.project.model.UserEventModel;
import java.util.List;

/**
 *
 * @author root
 */
public interface GetUsersMapper {
    
    public LoginAuthModel getUser(String login, String psw);
    
    public List<LoginAuthModel> getList();
    
    public void deleteObject(int id);
    
    public void updateUser(LoginAuthModel user);
    
    public void addObject(LoginAuthModel user);
    
    public void setEvent(UserEventModel ev);
    
    public void delEvent(UserEventModel ev);
    
    public void updEvent(UserEventModel ev);
    
}
