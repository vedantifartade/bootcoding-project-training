package com.online.restuarent.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItemDAO {
    public static final String TABLE_NAME = "app_order_menu_item";
    public void createTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","ved@2511");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;
            String query = "CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" (id bigint NOT NULL,"+"order_id bigint,"
                    +"quantity int4,"+"menu_item_name text,"
                    +"is_veg bool,"+"total_price numeric,"
                    +"CONSTRAINT app_order_menu_item_pk PRIMARY KEY (id))";
            System.out.println("Create Table query : "+query);

            stmt.executeUpdate(query);
//            ResultSet rs = stmt.executeQuery(sql);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}