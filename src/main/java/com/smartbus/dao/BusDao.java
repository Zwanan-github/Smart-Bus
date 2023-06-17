package com.smartbus.dao;

import com.smartbus.model.Bus;

import java.sql.SQLException;

/**
 * @author hu'hao
 */
public interface BusDao {

    void delete(Bus bus) throws SQLException;

    void update(Bus bus) throws SQLException;

    void add(Bus bus) throws SQLException;
}
