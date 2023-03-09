/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.*;
import model.Chitiet_truc;
import model.Kythuatvien;
import com.mysql.jdbc.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DAO {

    static Connection conn = null;
    static String connectionURL = "jdbc:mysql://localhost:3306/quanly_tkb";
    static String username = "root";
    static String password = "";

    public static Connection getConnect() {
//        connect connectJDBC = new connect();
//        conn = connectJDBC.connect();
        try {
            conn = (Connection) DriverManager.getConnection(connectionURL, username, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    public ArrayList<Chitiet_truc> getListTruc(int number) {
        ArrayList<Chitiet_truc> list = new ArrayList<>();
        String sql = "SELECT * FROM chitiet_truc "
                + "INNER JOIN thu ON chitiet_truc.thu_id = thu.id "
                + "INNER JOIN ca ON chitiet_truc.buoi_id = ca.id "
                + "INNER JOIN kythuatvien ON chitiet_truc.kythuatvien_id = kythuatvien.id "
                + "INNER JOIN hocky ON chitiet_truc.hocky_id = hocky.id "
                + "WHERE thu_id = " + number + "";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Chitiet_truc chiTiett = new Chitiet_truc();
                chiTiett.setId(rs.getInt("id"));
                chiTiett.setHocky_Id(rs.getString("hocky.tenhocky"));
                chiTiett.setThu_Id(rs.getString("thu.tenthu"));
                chiTiett.setCa_Id(rs.getString("ca.tenca"));
                chiTiett.setKythuatvien_Id(rs.getString("kythuatvien.ten_ktv"));
                chiTiett.setGhiChu(rs.getString("ghichu"));
                list.add(chiTiett);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public ResultSet ThucThiLenhSelect(String cauLenhSQL) {

        try {
            Statement stm = conn.createStatement();
            return stm.executeQuery(cauLenhSQL);
        } catch (SQLException ex) {
            System.out.println("Lỗi");
        }
        return null;
    }
    
    

}
