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

public class Delete {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection konek = null;
        Statement s = null;
        Class.forName("org.mariadb.jdbc.Driver");
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            konek = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "root", "");
            s = konek.createStatement();
            String sql = "DELETE FROM tablename WHERE NIM = 4";
            PreparedStatement stat = konek.prepareStatement(sql);
            s.executeUpdate(sql);
            if (konek != null) {
                System.out.println("Berhasil delete");
            } else {
                System.out.println("Delete gagal");
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
