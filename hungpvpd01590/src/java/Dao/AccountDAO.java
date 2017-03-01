/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Controller.ConnecDB;
import Model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class AccountDAO {
     public ArrayList<Account> getListAccounts(String Username) throws SQLException {
        Connection con = ConnecDB.getConnecttion();
        String sql = "SELECT * FROM TAI_KHOAN WHERE Username = '" + Username + "'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Account> list = new ArrayList<>();
        while (rs.next()) {
            Account account = new Account();
            account.setUsername(rs.getString("Username"));
            account.setPass(rs.getString("Pass"));
            account.setVaitro(rs.getString("Vai_tro"));
            account.setHoten(rs.getString("Ho_ten"));
            account.setDiachi(rs.getString("Dia_chi"));
            account.setEmail(rs.getString("Email"));
            account.setSdt(rs.getString("Sdt"));
            
            list.add(account);
        }
        return list;
    }
       public static void main(String[] args) throws SQLException {
        AccountDAO dao = new AccountDAO();
        for (Account p : dao.getListAccounts("Hoang")) {
            System.out.println(p.getHoten()+ "---" + p.getVaitro());
        }
}
}
