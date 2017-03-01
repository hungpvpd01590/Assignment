/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ConnecDB {
    Connection con;
    String dbname;
    String user;
    String pass;
    public ConnecDB(String dbname, String user, String pass){
        this.dbname=dbname;
        this.user=user;
        this.pass=pass;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLWEB","hung","123");
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
    public static Connection getConnecttion() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLWEB","hung","123");
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;
    }
public int Login(String user, String pass){ // tro ve 0 khi login sai, 1 la ad, 2 la khach hang
    try {
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("select * from TAI_KHOAN where Username= '"+user+"' and Pass= '"+pass+"' ");
        if(rs.next()){
            if(rs.getString(3).equals("admin"))
                return 1;
            else 
                return 2;
        }else{
            return 0;
        }
    } catch (Exception e) {
        return 0;
    }
    
}
public int InsertProduct(Product obj ){
    try {
        int i;
        try (Statement st = con.createStatement()) {
            i = st.executeUpdate("insert into SAN_PHAM values('"+obj.getMasp()+"','"+obj.getTensp()+"','"+obj.getMota()+
                    "','"+obj.getSoluong()+"','"+obj.getDongia()+"','"+obj.getHinhanh()+"','"+
                    obj.getNhasx()+"','"+obj.getMaloai()+"')");
        }
        return i;
    } catch (Exception e) {
        Logger.getLogger(ConnecDB.class.getName()).log(Level.SEVERE,null,e);
        return 0;
    }
}
    public static void main(String[] args) {
        ConnecDB cn = new ConnecDB("QLWEB","hung","123456");
    }
}
