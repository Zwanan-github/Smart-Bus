package com.smartbus.dao.impl;

import com.smartbus.dao.BusDao;
import com.smartbus.dao.DaoFactory;
import com.smartbus.model.Bus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BusDaoImpl implements BusDao {

    @Override
    public void delete(Bus bus) throws SQLException {
        Connection conn = DaoFactory.getConnect();
        StringBuffer sql = new StringBuffer("delete from bus where bus_id = ?");
        PreparedStatement pstm = conn.prepareStatement(sql.toString());
        pstm.setInt(1, bus.getBusId());
        pstm.executeUpdate();
        pstm.close();
        conn.close();
    }

    @Override
    public void update(Bus bus) throws SQLException {
        Connection conn = DaoFactory.getConnect();
        StringBuffer sql = new StringBuffer("update bus set bus_license = ? and bus_type = ? and bus_status = ? and start_time = ?");
        PreparedStatement pstm = conn.prepareStatement(sql.toString());
        pstm.setString(1, bus.getBuslicense());
        pstm.setString(2, bus.getBusType());
        pstm.setString(3, bus.getBusStatus());
        pstm.setString(4, bus.getStartTime());
        pstm.executeUpdate();
        pstm.close();
        conn.close();
    }

    @Override
    public void add(Bus bus) throws SQLException {
        Connection conn = DaoFactory.getConnect();
        StringBuffer sql = new StringBuffer("insert into bus(bus_license,bus_type,bus_status,start_time) values(?,?,?,?)");
        PreparedStatement pstm = conn.prepareStatement(sql.toString());
        pstm.setString(1, bus.getBuslicense());
        pstm.setString(2, bus.getBusType());
        pstm.setString(3, bus.getBusStatus());
        pstm.setString(4, bus.getStartTime());
        pstm.executeUpdate();
        pstm.close();
        conn.close();
    }
}
