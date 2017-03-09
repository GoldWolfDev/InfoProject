/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao.abstraction;

import com.inform.project.model.UserSellsModel;
import java.util.List;

/**
 *
 * @author artur
 */
public interface GetSellsMapper {
    public List<UserSellsModel> getListSells();
     
    public void setSells(UserSellsModel sell);
    
    public void delSells(UserSellsModel sell);
    
    public void updSells(UserSellsModel sell);
}
