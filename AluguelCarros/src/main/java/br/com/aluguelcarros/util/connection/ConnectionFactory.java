package br.com.aluguelcarros.util.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnectionMysql() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/aluguel";
        String login = "root";
        String senha = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, login, senha);
    }
}
