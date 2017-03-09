/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao.abstraction;

import com.inform.project.model.UserEventModel;
import java.util.List;

/**
 *
 * @author root
 */
public interface GetEventsMapper {
    
    public List<UserEventModel> getEvents();
    
    public void addEvent(UserEventModel event);
    
    public void saveEdit(UserEventModel event);
    
    public void deleteEvent(UserEventModel event);
}
