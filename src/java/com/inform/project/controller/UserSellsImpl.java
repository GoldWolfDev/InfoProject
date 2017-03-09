/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.controller;

import com.inform.project.controller.abstraction.UserSells;
import com.inform.project.dao.MyBatisGetSellsImpl;
import com.inform.project.dao.abstraction.GetSellsMapper;
import com.inform.project.model.UserSellsModel;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author artur
 */
@ManagedBean(name ="userSells")
@SessionScoped
public class UserSellsImpl implements Serializable, UserSells{
    
    private final Serializable id = 1L;
    
    private int idSell;
    
    private String nameSell; 
    
    private String sell;

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public int getIdSell() {
        return idSell;
    }

    public void setIdSell(int idSell) {
        this.idSell = idSell;
    }

    public String getNameSell() {
        return nameSell;
    }

    public void setNameSell(String nameSell) {
        this.nameSell = nameSell;
    }

    @Override
    public List<UserSellsModel> getListSells() {
       GetSellsMapper map = new MyBatisGetSellsImpl();
       return map.getListSells();
    }

    @Override
    public void setSells() {
        UserSellsModel sell = new UserSellsModel();
        sell.setName(getNameSell());
        sell.setSell(getSell());
        GetSellsMapper map = new MyBatisGetSellsImpl();
        map.setSells(sell);
    }

    @Override
    public void delSells() {
        UserSellsModel sell = new UserSellsModel();
        sell.setId(idSell);
        GetSellsMapper map = new MyBatisGetSellsImpl();
        map.delSells(sell);
    }

    @Override
    public void updSells() {
        UserSellsModel sell = new UserSellsModel();
        sell.setId(idSell);
        sell.setName(getNameSell());
        sell.setSell(getSell());
        GetSellsMapper map = new MyBatisGetSellsImpl();
        map.updSells(sell);
    }
    
    
    
}
