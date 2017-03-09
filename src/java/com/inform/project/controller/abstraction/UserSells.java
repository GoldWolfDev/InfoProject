/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.controller.abstraction;

import com.inform.project.model.UserSellsModel;
import java.util.List;

/**
 *
 * @author artur
 */
public interface UserSells {
    
    public List<UserSellsModel> getListSells();
    
    public void setSells();
    
    public void delSells();
    
    public void updSells();
    
}
