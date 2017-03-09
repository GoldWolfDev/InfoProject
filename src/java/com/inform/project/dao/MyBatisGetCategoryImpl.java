/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.dao;

import com.inform.project.dao.abstraction.GetCategoryMapper;
import com.inform.project.model.UserCategoryModel;
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
public class MyBatisGetCategoryImpl implements GetCategoryMapper{

    @Override
    public List<UserCategoryModel> getListCategory() {
        List<UserCategoryModel> list = null;
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            list = session.selectList("GetUsersCategoryMapper.getCategoryList");
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
    public void setCategory(UserCategoryModel category) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.insert("GetUsersCategoryMapper.insertOne", category);
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
    public void delCategory(UserCategoryModel category) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.delete("GetUsersCategoryMapper.deleteOne", category);
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
    public void updCategory(UserCategoryModel category) {
        SqlSession session = null;
        try {
            session = MyBatisSession.getInst().getSession().openSession();
            session.update("GetUsersCategoryMapper.updateOne", category);
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
