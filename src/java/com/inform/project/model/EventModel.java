/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.model;

import java.util.Date;

/**
 *
 * @author artur
 */
public class EventModel {
    
    private int idTEvents;
    private String EventName;
    private String InfoEvent;
    private String ImageEvent;
    private int idLocation;	
    private int idSells;	
    private int idGroup;	
    private Date DateEvents;

    public int getIdTEvents() {
        return idTEvents;
    }

    public void setIdTEvents(int idTEvents) {
        this.idTEvents = idTEvents;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public String getInfoEvent() {
        return InfoEvent;
    }

    public void setInfoEvent(String InfoEvent) {
        this.InfoEvent = InfoEvent;
    }

    public String getImageEvent() {
        return ImageEvent;
    }

    public void setImageEvent(String ImageEvent) {
        this.ImageEvent = ImageEvent;
    }

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public int getIdSells() {
        return idSells;
    }

    public void setIdSells(int idSells) {
        this.idSells = idSells;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public Date getDateEvents() {
        return DateEvents;
    }

    public void setDateEvents(Date DateEvents) {
        this.DateEvents = DateEvents;
    }
    
    
    
    
}
