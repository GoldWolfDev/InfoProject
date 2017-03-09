/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao;

import com.inform.project.dao.abstraction.GetUsersMapper;
import com.inform.project.model.LoginAuthModel;
import com.inform.project.model.UserEventModel;
import com.inform.project.util.MyBatisSession;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.session.SqlSession;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author root
 */
public class MyBatisAdminImpl implements GetUsersMapper{    
    @Override     
    public LoginAuthModel getUser(String login, String psw){
        LoginAuthModel sys = null;         
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            sys = session.selectOne("GetUsersMapper.getUser", new LoginAuthModel(login, psw));
        } catch (IOException ex) {
            Logger.getLogger(MyBatisAdminImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(session!=null){
                session.close();
            }
        }   
        return sys;
    }
    
    @Override
    public List<LoginAuthModel> getList(){  
        List<LoginAuthModel> list =null;
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            list = session.selectList("GetUsersMapper.getList");
        } catch (IOException ex) {
            Logger.getLogger(MyBatisAdminImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(session!=null){
                session.close();
            }
        }   
        return list;
    }

    @Override
    public void deleteObject(int id){
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.delete("GetUsersMapper.deleteOne",id);
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
    public void addObject(LoginAuthModel user) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.insert("GetUsersMapper.insertOne",user);
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
    public void updateUser(LoginAuthModel user) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.update("GetUsersMapper.updateOne",user);
            session.commit();
            System.out.println("commit");
        } catch (IOException ex) {
            System.out.println(ex);
            Logger.getLogger(MyBatisAdminImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(session!=null){
                session.close();
            }
        }      
    }

    @Override
    public void setEvent(UserEventModel ev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delEvent(UserEventModel ev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updEvent(UserEventModel ev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
