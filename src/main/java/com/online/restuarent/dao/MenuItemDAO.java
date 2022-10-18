package com.online.restuarent.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuItemDAO {
    public static final String TABLE_NAME = "menu_item";
    public void crateTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","ved@2511");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println("Menu Item Name = " + rs.getString("menu_item_name"));
                System.out.println("Prize = " + rs.getString("price"));
                System.out.println("Category = " + rs.getString("category"));
                System.out.println("IsVeg = " + rs.getString("is_veg"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
