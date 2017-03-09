/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.controller;

import com.inform.project.controller.abstraction.UserCategory;
import com.inform.project.dao.MyBatisGetCategoryImpl;
import com.inform.project.dao.abstraction.GetCategoryMapper;
import com.inform.project.model.UserCategoryModel;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author artur
 */
@ManagedBean(name = "userCategory")
public class UserCategoryImpl implements Serializable, UserCategory{
    private final Serializable id = 1L;
    
    private int idCategory;
    
    private String name;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    @Override
    public List<UserCategoryModel> getListCategory() {
        GetCategoryMapper map = new MyBatisGetCategoryImpl();
        return map.getListCategory();
    }

    @Override
    public void setCategory() {
        UserCategoryModel category = new UserCategoryModel();
        category.setName(name);
        GetCategoryMapper map = new MyBatisGetCategoryImpl();
        map.setCategory(category);
    }

    @Override
    public void delCategory() {
        UserCategoryModel category = new UserCategoryModel();
        category.setId(idCategory);
        GetCategoryMapper map = new MyBatisGetCategoryImpl();
        map.delCategory(category);
    }

    @Override
    public void updCategory() {
        UserCategoryModel category = new UserCategoryModel();
        category.setName(name);
        category.setId(idCategory);
        GetCategoryMapper map = new MyBatisGetCategoryImpl();
        map.updCategory(category);
    }
}
