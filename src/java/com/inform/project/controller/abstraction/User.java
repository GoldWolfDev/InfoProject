/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.controller.abstraction;

import com.inform.project.model.UserEventModel;
import java.util.List;

/**
 *
 * @author root
 */
public interface User {
    
    public List<UserEventModel> getListUsers();
    
    public void setEvent();
    
    public void delEvent();
    
    public void updEvent();
//    
//    public List<UserEventModel> getEventForEventName();
//    
//    public List<UserEventModel> getEventForLocation();
//    
//    public List<UserEventModel> getEventForSells();
//    
//    public List<UserEventModel> getEventForGroup();
}
