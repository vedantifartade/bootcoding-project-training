package com.online.restuarent.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuItemDAO {
    public static final String TABLE_NAME = "app_menu_item";
    public void createTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","ved@2511");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;
            String query = "CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" (id bigint NOT NULL,"+"vendor_id bigint,"
                    +"menu_item_name text, "+"price decimal, "
                    +"category text,"+"is_veg bool,"
                    +"CONSTRAINT app_menu_item_pk PRIMARY KEY (id))";
            System.out.println("Create Table query : "+query);
            stmt.executeUpdate(query);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
