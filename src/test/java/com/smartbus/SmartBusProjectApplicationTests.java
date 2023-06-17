package com.smartbus;

import com.smartbus.constants.OperateKey;
import com.smartbus.model.Bus;
import com.smartbus.service.BusService;
import com.smartbus.service.impl.BusServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SmartBusProjectApplicationTests {

    BusService busService = new BusServiceImpl();

    @Test
    void contextLoads() {
        Map<String, List<Bus>> map = new HashMap<String, List<Bus>>();
        Bus bus = new Bus();
        bus.setBusId(null);
        bus.setBusStatus("启用");
        bus.setBuslicense("鄂A-12345");
        bus.setBusType("奔驰480S");
        bus.setStartTime("2023/02/20 12:20:10");
        ArrayList<Bus> list = new ArrayList<>();
        list.add(bus);
        map.put(OperateKey.OP_ADD, list);

        System.out.println(busService.save(map));
    }

}
