/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao;

import com.inform.project.dao.abstraction.GetLocationMapper;
import com.inform.project.model.UserLocationModel;
import com.inform.project.util.MyBatisSession;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author artur
 */
public class MyBatisGetLocationImpl implements GetLocationMapper{

    @Override
    public List<UserLocationModel> getListLocation() {
        List<UserLocationModel> list = null;
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            list = session.selectList("GetUsersLocationMapper.getLocationList");
        } catch (IOException ex) {
            Logger.getLogger(MyBatisGetEventsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(session!=null){
                session.close();
            }
        }   
        return list;
    }

    @Override
    public void setLocation(UserLocationModel loc) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.insert("GetUsersLocationMapper.insertOne", loc);
            session.commit();
        } catch (IOException ex) {
            Logger.getLogger(MyBatisAdminImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(session!=null){
                session.close();
            }
        }          
    }

    @Override
    public void delLocation(UserLocationModel loc) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.delete("GetUsersLocationMapper.deleteOne", loc);
            session.commit();
        } catch (IOException ex) {
            Logger.getLogger(MyBatisAdminImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(session!=null){
                session.close();
            }
        }          
    }

    @Override
    public void updLocation(UserLocationModel loc) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.update("GetUsersLocationMapper.updateOne", loc);
            session.commit();
        } catch (IOException ex) {
            Logger.getLogger(MyBatisAdminImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(session!=null){
                session.close();
            }
        }          
    }
    
}
