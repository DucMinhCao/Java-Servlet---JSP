package DAO;

import Bean.Province;
import Bean.Users;
import DB.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RegisterDAO {
    public static List<Province> getProvinceList() {
        Connection connection = null;
        PreparedStatement pstm = null;
        List<Province> resultList = new ArrayList<>();
        try {
            connection = DBConnection.getConnection();
            String query = "SELECT * FROM province";
            pstm = connection.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Province dummyProvince = new Province();
                dummyProvince.setId(rs.getInt("id"));
                dummyProvince.setName(rs.getString("name"));
                resultList.add(dummyProvince);
            }
            rs.close();
            pstm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return resultList;
    }

    public static boolean save(Users users) {
        Connection connection = null;
        PreparedStatement pstm = null;
        try {
            connection = DBConnection.getConnection();
            String insertedSQL = "INSERT INTO users(name, address, email, phone, province) VALUES (?, ?, ?, ?, ?)";
            pstm = connection.prepareStatement(insertedSQL);
            pstm.setString(1, users.getName());
            pstm.setString(2, users.getAddress());
            pstm.setString(3, users.getEmail());
            pstm.setString(4, users.getPhone());
            pstm.setString(5, users.getProvince());
            int affectedRow = pstm.executeUpdate();
            if (affectedRow == 0) {
                throw new Exception("Erro Cannot insert to SQL");
            }
            pstm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }
}
