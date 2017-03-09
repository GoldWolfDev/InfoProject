/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.controller;

import com.inform.project.dao.MyBatisGetEventsImpl;
import com.inform.project.dao.abstraction.GetEventsMapper;
import com.inform.project.model.UserEventModel;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.inform.project.controller.abstraction.User;
import com.inform.project.controller.abstraction.UserCategory;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author root
 */
@ManagedBean(name = "users")
@SessionScoped
public class UserImpl implements User, Serializable{
    
    private final Serializable id = 1L;
    
    private int idEvents;
    private String eventName;
    private String eventLocation;
    private String eventSells;
    private String eventInfo;
    private String eventGroup;
    private String eventImage;
    private String eventDate;
       
    @Override
    public List<UserEventModel> getListUsers() {
        GetEventsMapper map = new MyBatisGetEventsImpl();
        return map.getEvents();
    }    

    
    public int getIdEvents() {
        return idEvents;
    }

    public void setIdEvents(int idEvents) {
        this.idEvents = idEvents;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventSells() {
        return eventSells;
    }

    public void setEventSells(String eventSells) {
        this.eventSells = eventSells;
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }

    public String getEventGroup() {
        return eventGroup;
    }

    public void setEventGroup(String eventGroup) {
        this.eventGroup = eventGroup;
    }

    public String getEventImage() {
        return eventImage;
    }

    public void setEventImage(String eventImage) {
        this.eventImage = eventImage;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }    

    @Override
    public void setEvent(UserEventModel ev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delEvent(UserEventModel ev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updEvent(UserEventModel ev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
