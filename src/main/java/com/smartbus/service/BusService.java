package com.smartbus.service;

import com.smartbus.model.Bus;

import java.util.List;
import java.util.Map;

public interface BusService {

    /**
     * 对车辆进行操作
     * @param busOperate 对数据库的增删改查的操作和数据
     * @return 返回是否成功
     */
    String save(Map<String, List<Bus>> busOperate);

}
