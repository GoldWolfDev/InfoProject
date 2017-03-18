/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao;

import com.inform.project.dao.abstraction.GetEventsMapper;
import com.inform.project.model.EventModel;
import com.inform.project.model.UserEventModel;
import com.inform.project.util.MyBatisSession;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author root
 */
public class MyBatisGetEventsImpl implements GetEventsMapper{

    @Override
    public List<UserEventModel> getEvents() { 
        List<UserEventModel> list = null;
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            list = session.selectList("GetEventsMapper.getEventsList");
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
    public void addEvent(EventModel event) { 
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.insert("GetEventsModelMapper.insertOne", event);
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
    public void saveEdit(EventModel event) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.update("GetEventsModelMapper.updateOne", event);
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
    public void deleteEvent(EventModel event) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.delete("GetEventsModelMapper.deleteOne", event);
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
    public List<UserEventModel> getEventForEventName(UserEventModel event) {
        List<UserEventModel> list = null;
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            list = session.selectList("GetEventsMapper.getListForEventName", event);
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
    public List<UserEventModel> getEventForLocation(UserEventModel event) {
        List<UserEventModel> list = null;
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            list = session.selectList("GetEventsMapper.getListForLocation", event);
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
    public List<UserEventModel> getEventForSells(UserEventModel event) {
        List<UserEventModel> list = null;
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            list = session.selectList("GetEventsMapper.getListForSell", event);
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
    public List<UserEventModel> getEventForGroup(UserEventModel event) {
        List<UserEventModel> list = null;
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            list = session.selectList("GetEventsMapper.getListForGroup", event);
        } catch (IOException ex) {
            Logger.getLogger(MyBatisGetEventsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(session!=null){
                session.close();
            }
        }   
        return list;
    }
    
}
