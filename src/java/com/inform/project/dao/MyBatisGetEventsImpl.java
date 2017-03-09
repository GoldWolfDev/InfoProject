/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao;

import com.inform.project.dao.abstraction.GetEventsMapper;
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
    public void addEvent(UserEventModel event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveEdit(UserEventModel event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEvent(UserEventModel event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
