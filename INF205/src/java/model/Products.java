/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuoc
 */
public class Products {
    public Products(){
        
    }
    public void insert(String code,String name, float pri) {
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=AssSOF301";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql ="insert into Products values(?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, code);
            stm.setString(2, name);
            stm.setFloat(3, pri);
            stm.executeUpdate();
            stm.close();
            con.close();
    }catch(Exception e){
       
    
    }
    }
    
    
    public void update(String code,String name, float pri) throws ClassNotFoundException, SQLException{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=AssSOF301";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="update Products set Name=?, Price=? where Code=?";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(3,code);
            stm.setString(1,name);
            stm.setFloat(2, pri);
            
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void delete(String masp){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=AssSOF301";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="Delete  from Products where Code=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, masp);
            stm.executeUpdate();
            stm.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public List<Product> showProduct(String tensp){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=AssSOF301";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql="select * from Products";
            if(tensp.length()>0){
                sql +=" where Name like '%"+tensp+"%'";
                
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<Product> list = new ArrayList<Product>();
            while(rs.next()){
                String code = rs.getString("Code");
                String name = rs.getString("Name");
                float price = rs.getFloat("Price");
               Product sp = new Product(code, name, price);
                list.add(sp);
            }
            return list;
        }catch(Exception e){
            e.printStackTrace();
        }
    return null;
    }

}
