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
import com.inform.project.model.EventModel;
import java.util.Date;

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
    private Date eventDate; 
    private int idGroup;
    private int idSell;
    private int idLocation;
    private String searchEvent;
    private List<UserEventModel> model;

    public String getSearchEvent() {
        return searchEvent;
    }

    public void setSearchEvent(String searchEvent) {
        this.searchEvent = searchEvent;
    }    
    
    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }    

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
        
    public int getIdSell() {
        return idSell;
    }

    public void setIdSell(int idSell) {
        this.idSell = idSell;
    }
    
    

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
    
    public void setFirst(){
        GetEventsMapper map = new MyBatisGetEventsImpl();
        model = map.getEvents();
    }
          
    @Override
    public List<UserEventModel> getListUsers() {
        setFirst();
        return model;
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

    @Override
    public void setEvent() {
        EventModel event = new EventModel();
        event.setDateEvents(eventDate);
        event.setEventName(eventName);
        event.setIdGroup(idGroup);
        event.setIdLocation(idLocation);
        event.setIdSells(idSell);
        event.setImageEvent(eventImage);
        event.setInfoEvent(eventInfo);
        GetEventsMapper map = new MyBatisGetEventsImpl();
        map.addEvent(event);
    }

    @Override
    public void delEvent() {
        EventModel event = new EventModel();
        event.setIdTEvents(idEvents);        
        GetEventsMapper map = new MyBatisGetEventsImpl();
        map.deleteEvent(event);
    }

    @Override
    public void updEvent() {
        EventModel event = new EventModel();
        event.setIdTEvents(idEvents);
        event.setDateEvents(eventDate);
        event.setEventName(eventName);
        event.setIdGroup(idGroup);
        event.setIdLocation(idLocation);
        event.setIdSells(idSell);
        event.setImageEvent(eventImage);
        event.setInfoEvent(eventInfo);
        GetEventsMapper map = new MyBatisGetEventsImpl();
        map.saveEdit(event);
    }

    public void eventNameGetList() {
        GetEventsMapper map = new MyBatisGetEventsImpl();
        UserEventModel event = new UserEventModel();
        event.setEventName(parserSearch(searchEvent));
        model = map.getEventForEventName(event);
    }

    public void locationNameGetList() {
        GetEventsMapper map = new MyBatisGetEventsImpl();
        UserEventModel event = new UserEventModel();
        event.setEventLocation(parserSearch(searchEvent));
        model = map.getEventForLocation(event);
    }

    public void sellsNameGetList() {
        GetEventsMapper map = new MyBatisGetEventsImpl();        
        UserEventModel event = new UserEventModel();
        event.setEventSells(parserSearch(searchEvent));
        model = map.getEventForSells(event);
    }

    public void groupNameGetList() {
        GetEventsMapper map = new MyBatisGetEventsImpl();        
        UserEventModel event = new UserEventModel();
        event.setEventGroup(parserSearch(searchEvent));
        model = map.getEventForGroup(event);
    }

    private String parserSearch(String search){
        return "%"+search+"%";
    }
    
}
