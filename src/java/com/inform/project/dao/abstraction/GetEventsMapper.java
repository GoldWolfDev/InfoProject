/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao.abstraction;

import com.inform.project.model.EventModel;
import com.inform.project.model.UserEventModel;
import java.util.List;

/**
 *
 * @author root
 */
public interface GetEventsMapper {
    
    public List<UserEventModel> getEvents();
    
    public void addEvent(EventModel event);
    
    public void saveEdit(EventModel event);
    
    public void deleteEvent(EventModel event);
    
    public List<UserEventModel> getEventForEventName(UserEventModel event);
    
    public List<UserEventModel> getEventForLocation(UserEventModel event);
    
    public List<UserEventModel> getEventForSells(UserEventModel event);
    
    public List<UserEventModel> getEventForGroup(UserEventModel event);
}
