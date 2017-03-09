/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inform.project.util;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author root
 */
public class MyBatisSession {
    
    Reader reader = null;
    
    private SqlSessionFactory sqlSessionFactory;
    
    private static MyBatisSession inst = null;
    
    private MyBatisSession(){
        
    }

    public static MyBatisSession getInst() {
        if(inst==null){
            inst = new MyBatisSession();
        }
        return inst;
    }
    
    public SqlSessionFactory getSession() throws IOException{
        reader = Resources
                    .getResourceAsReader("mybatis-config.xml"); //Читаем файл с настройками подключения и настройками MyBatis
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        if(reader!=null){
            reader.close();
        }
        return sqlSessionFactory;
    }
    
}
