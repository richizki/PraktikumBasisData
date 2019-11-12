/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

/**
 *
 * @author Ichie
 */
import java.sql.*;

public class Insert {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection konek = null;
        Statement s = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            konek = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "root", "");
            s = konek.createStatement();
            String sql = "INSERT INTO mhs values (6, 'Naila', 'malang', '01929022' )";
            s.executeQuery(sql);
            if (konek != null) {
                System.out.println("Insert data berhasil");
            } else {
                System.out.println("Insert gagal");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Pesan error : " + e);
        }

        try {
            if (konek != null) {
                konek.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
