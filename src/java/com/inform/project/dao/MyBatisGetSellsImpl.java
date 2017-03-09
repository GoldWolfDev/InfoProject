/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao;

import com.inform.project.dao.abstraction.GetSellsMapper;
import com.inform.project.model.UserSellsModel;
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
public class MyBatisGetSellsImpl implements GetSellsMapper{

    @Override
    public List<UserSellsModel> getListSells() {
        List<UserSellsModel> list = null;
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            list = session.selectList("GetUsersSellsMapper.getSellsList");
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
    public void setSells(UserSellsModel sell) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.insert("GetUsersSellsMapper.setSells", sell);
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
    public void delSells(UserSellsModel sell) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.delete("GetUsersSellsMapper.deleteOne", sell);
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
    public void updSells(UserSellsModel sell) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.update("GetUsersSellsMapper.updateOne",sell);
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
