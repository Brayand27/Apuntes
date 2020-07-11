package com.apuntes.modelo.dao;

import com.apuntes.modelo.vo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {

    Usuario vo;
    ResultSet rs;
    Connection cnn;

    public int ValidaLogin() throws SQLException {
        cnn = DriverManager.getConnection("jdbc:mysql://localhost/java_mysql", "root", "");
        Statement sentencia = cnn.createStatement();
        rs = sentencia.executeQuery("SELECT count(*) FROM Apuntes.Usuarios WHERE user=" + vo.getUser() + " AND pass=" + vo.getPass());
        if (rs.next()) {
            System.out.println("Login exitoso");
        }
        return 0;
    }

}
