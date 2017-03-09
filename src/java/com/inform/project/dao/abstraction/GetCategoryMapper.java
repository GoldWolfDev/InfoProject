/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao.abstraction;

import com.inform.project.model.UserCategoryModel;
import java.util.List;

/**
 *
 * @author artur
 */
public interface GetCategoryMapper {
    public List<UserCategoryModel> getListCategory();
    
    public void setCategory(UserCategoryModel category);
    
    public void delCategory(UserCategoryModel category);
    
    public void updCategory(UserCategoryModel category);
}
