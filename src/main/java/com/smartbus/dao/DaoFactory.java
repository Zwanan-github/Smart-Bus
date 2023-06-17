package com.smartbus.dao;

import com.smartbus.dao.impl.BusDaoImpl;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class DaoFactory {

    private static String userName;
    private static String password;
    private static String ip;
    private static String port;
    private static String dbName;
    private static String connectString = "";
    static {
        try {
            InputStream configInputStream = new FileInputStream(
                    "config/config.xml");
            Properties properties = new Properties();
            properties.loadFromXML(configInputStream);
            userName = properties.getProperty("userName");
            password = properties.getProperty("password");
            ip = properties.getProperty("ip");
            port = properties.getProperty("port");
            dbName = properties.getProperty("dbName");
            connectString = "jdbc:mysql://" + ip + ":" + port + "/" + dbName+"?useUnicode=true&characterEncoding=UTF-8";
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnect() {
        try {
            return DriverManager.getConnection(connectString, userName,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static BusDao getBusDao() {
        return new BusDaoImpl();
    }

}
