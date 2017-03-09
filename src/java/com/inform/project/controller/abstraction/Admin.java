/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.controller.abstraction;

import com.inform.project.model.LoginAuthModel;
import java.util.List;

/**
 *
 * @author root
 */
public interface Admin {
    
    public void saveUser();
    
    public void deleteUser();
    
    public List<LoginAuthModel> getListUsers();
    
    public void update();
   
}
