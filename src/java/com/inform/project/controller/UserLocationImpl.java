/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.controller;

import com.inform.project.controller.abstraction.UserLocation;
import com.inform.project.dao.MyBatisGetLocationImpl;
import com.inform.project.dao.abstraction.GetLocationMapper;
import com.inform.project.model.UserLocationModel;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author artur
 */
@ManagedBean(name="userLocation")
@SessionScoped
public class UserLocationImpl implements Serializable, UserLocation{

    private final Serializable id = 1L;
    
    private int idLocation;
    private String name;

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public List<UserLocationModel> getListLocation() {
        GetLocationMapper map = new MyBatisGetLocationImpl();
        return map.getListLocation();
         
    }

    @Override
    public void setLocation() {
        UserLocationModel loc = new UserLocationModel();
        loc.setName(name);
        GetLocationMapper map = new MyBatisGetLocationImpl();
        map.setLocation(loc);
    }

    @Override
    public void delLocation() {
        UserLocationModel loc = new UserLocationModel();
        loc.setId(idLocation);
        GetLocationMapper map = new MyBatisGetLocationImpl();
        map.delLocation(loc);
    }

    @Override
    public void updLocation() {
        UserLocationModel loc = new UserLocationModel();
        loc.setName(name);
        loc.setId(idLocation);
        GetLocationMapper map = new MyBatisGetLocationImpl();
        map.updLocation(loc);
    }
    
}
