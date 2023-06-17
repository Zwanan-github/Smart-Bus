package com.smartbus.service.impl;

import com.smartbus.constants.OperateKey;
import com.smartbus.dao.BusDao;
import com.smartbus.dao.DaoFactory;
import com.smartbus.model.Bus;
import com.smartbus.service.BusService;

import java.util.List;
import java.util.Map;

public class BusServiceImpl implements BusService {

    @Override
    public String save(Map<String, List<Bus>> busOperate) {
        try {
            BusDao busDao = DaoFactory.getBusDao();
            List<Bus> busList = busOperate.get(OperateKey.OP_DELETE);

            if (busList != null && !busList.isEmpty()) {
                for (Bus bus : busList) {
                    busDao.delete(bus);
                }
            }

            busList = busOperate.get(OperateKey.OP_UPDATE);
            if (busList != null && !busList.isEmpty()) {
                for (Bus bus : busList) {
                    busDao.update(bus);
                }
            }

            busList = busOperate.get(OperateKey.OP_ADD);
            if (busList != null && !busList.isEmpty()) {
                for (Bus bus : busList) {
                    busDao.add(bus);
                }
            }
        } catch (Exception e) {
            return OperateKey.OP_FAILURE;
        }
        return OperateKey.OP_SUCCESS;
    }
}
