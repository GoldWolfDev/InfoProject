/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao.abstraction;

import com.inform.project.model.UserLocationModel;
import java.util.List;

/**
 *
 * @author artur
 */
public interface GetLocationMapper {
    public List<UserLocationModel> getListLocation();
    
    public void setLocation(UserLocationModel loc);
    
    public void delLocation(UserLocationModel loc);
    
    public void updLocation(UserLocationModel loc);
}
